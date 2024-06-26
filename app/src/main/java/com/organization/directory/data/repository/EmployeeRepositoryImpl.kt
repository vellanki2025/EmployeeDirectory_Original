package com.organization.directory.data.repository

import com.organization.directory.core.common.Outcome
import com.organization.directory.data.api.EmployeeApi
import com.organization.directory.data.mapper.EmployeeDtoMapper
import com.organization.directory.domain.model.Employee
import com.organization.directory.domain.repository.EmployeeRepository
import javax.inject.Inject

/**
 * Implementation of [EmployeeRepository] interface to fetch Employee data from the backend.
 */
class EmployeeRepositoryImpl @Inject constructor(
    private val employeeApi: EmployeeApi,
    private val dtoMapper: EmployeeDtoMapper
) : EmployeeRepository {

    override suspend fun getEmployeeData(): Outcome<List<Employee>> {
        return try {
            val data = dtoMapper.mapFromEntity(employeeApi.getEmployeeData())
            Outcome.Success(data)
        } catch (e: Exception) {
            Outcome.Error(e.message)
        }
    }

    override suspend fun getMalfunctionedEmployeeData(): Outcome<List<Employee>> {
        return try {
            val data = dtoMapper.mapFromEntity(employeeApi.getMalfunctionedEmployeeData())
            Outcome.Success(data)
        } catch (e: Exception) {
            Outcome.Error(e.message)
        }
    }

    override suspend fun getEmptyEmployeeData(): Outcome<List<Employee>> {
        return try {
            val data = dtoMapper.mapFromEntity(employeeApi.getEmptyEmployeeData())
            Outcome.Success(data)
        } catch (e: Exception) {
            Outcome.Error(e.message)
        }
    }
}