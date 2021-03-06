package com.sudzusama.comparephones.data.source.db

import androidx.room.*
import com.sudzusama.comparephones.data.model.ComparsionEntity
import com.sudzusama.comparephones.data.model.ComparsionWithDevices
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface ComparsionsDao {
    @Transaction
    @Query("SELECT max(comparsionId) as comparsionId, firstDeviceName, secondDeviceName FROM comparsion GROUP BY firstDeviceName, secondDeviceName ORDER BY comparsionId DESC LIMIT :amount")
    fun getLatestComparsions(amount: Int): Single<List<ComparsionWithDevices>>

    @Transaction
    @Query("SELECT * FROM comparsion WHERE comparsionId = :id")
    fun getComparsionById(id: Int): Single<ComparsionWithDevices>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertComparsion(comparsionEntity: ComparsionEntity): Completable
}