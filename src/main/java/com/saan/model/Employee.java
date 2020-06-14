/**
 * 
 */
package com.saan.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sandeep Maurya
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
@ApiModel(description = "All details about the Employee. ")
public class Employee implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The database generated employee ID")
    private Long id;

    @ApiModelProperty(notes = "The employee name")
    private String firstName;

    @ApiModelProperty(notes = "The employee name")
    private String middleName;

    @ApiModelProperty(notes = "The employee name")
    private String lastName;

    @ApiModelProperty(notes = "The employee name")
    private int age;

    // @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "employee_id")
    // private List<Salary> salary;
    //
    // @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "employee_id")
    // private List<Address> address;
    //
    // @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "employee_id")
    // private List<Laptop> laptop;

}
