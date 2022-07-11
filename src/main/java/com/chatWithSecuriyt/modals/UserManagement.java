/**
 * 
 */
package com.chatWithSecuriyt.modals;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shiva
 * Added on 10-Jul-2022
 * Package  com.chatWithSecuriyt.modals
 */

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserManagement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private Integer userId;
	private String fullName;
	private	String department;
	private Integer experience;
	private	Integer startingFrom;
	private	String work_Details;
	private	Integer gender;
	private	String phoneNumber;
	private	String email;

	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(
			name="users_roles", joinColumns = @JoinColumn(name
					="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
	Set<RoleManagement> roles = new HashSet<RoleManagement>();
	
	
	/*
	 * @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 * 
	 * @JoinTable( name = "users_roles", joinColumns = @JoinColumn(name =
	 * "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id") ) private
	 * Set<Role> roles = new HashSet<>();
	 */	 
	
	
	
}
