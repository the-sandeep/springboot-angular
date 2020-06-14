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
@Table(name = "address")
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@ApiModel(description = "All details about the Address. ")
public class Address implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The database generated Address ID")
    private Long id;

    @ApiModelProperty(notes = "The employee Address addressType")
    private String addressType;

    @ApiModelProperty(notes = "The employee Address addressType")
    private String addressLine;

    @ApiModelProperty(notes = "The employee Address city")
    private String city;

    @ApiModelProperty(notes = "The employee Address state")
    private String state;

    @ApiModelProperty(notes = "The employee Address pin")
    private String pin;

    @ApiModelProperty(notes = "The employee Address countryCode")
    private String countryCode;
}
