/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.saan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.saan.model.Employee;
import com.saan.repository.EmployeeRepository;

/**
 * @author Sandeep Maurya
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee entity) {
        return employeeRepository.save(entity);
    }

    @Override
    @CachePut(value = "empCache")
    public Employee update(Employee entity) {

        return employeeRepository.save(entity);
    }

    @Override
    @CacheEvict(value = "empCache")
    public void deleteAll() {
        employeeRepository.deleteAll();

    }

    @Override
    @CacheEvict(value = "empCache")
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);

    }

    @Override
    @CacheEvict(value = "empCache")
    public void deleteInBatch(List<Employee> entities) {

        employeeRepository.deleteInBatch(entities);
    }

    @Override
    @Cacheable(value = "empCache")
    public Optional<Employee> findById(Long id) {

        return employeeRepository.findById(id);
    }

    @Override
    @Cacheable(value = "empCache")
    public List<Employee> findAll() {

        return employeeRepository.findAll();
    }

    @Override
    public long count() {

        return employeeRepository.count();
    }

}
