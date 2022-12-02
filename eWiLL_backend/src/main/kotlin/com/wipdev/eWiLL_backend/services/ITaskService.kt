package com.wipdev.eWiLL_backend.services

import com.wipdev.eWiLL_backend.endpoints.dataclasses.Task
import org.springframework.stereotype.Service

@Service
interface ITaskService {

    fun getAll(courseId: Long): List<Task>
    fun getById(id: Long): Task
    fun create(courseId: Long, task: Task): Boolean
    fun update(id: Long, task: Task): Task
    fun delete(id: Long): Task

}