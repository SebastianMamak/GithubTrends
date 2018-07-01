package pl.sm.domain.repository

import io.reactivex.Completable
import io.reactivex.Observable
import pl.sm.domain.model.Project

interface ProjectsRepository {

    fun getProjects(): Observable<List<Project>>

    fun bookmarkProject(projectId: String): Completable

    fun unbookmarkProject(projectId: String): Completable

    fun getBookmarkedProjects(): Observable<List<Project>>
}