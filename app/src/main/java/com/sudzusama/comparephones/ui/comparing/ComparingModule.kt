package com.sudzusama.comparephones.ui.comparing

import com.sudzusama.comparephones.di.ActivityScope
import com.sudzusama.comparephones.domain.repository.DeviceRepository
import com.sudzusama.comparephones.domain.usecase.UseCaseGetDeviceByName
import com.sudzusama.comparephones.domain.usecase.UseCaseRecentComparsions
import dagger.Module
import dagger.Provides

@Module
class ComparingModule {
    @ActivityScope
    @Provides
    fun providePresenter(comparingPresenter: ComparingPresenter): ComparingContract.Presenter =
        comparingPresenter

}