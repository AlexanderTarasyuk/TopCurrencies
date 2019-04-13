package info.alextarasyuk.top100currencies.di

import dagger.Module
import dagger.Provides
import info.alextarasyuk.top100currencies.mvp.presenter.CurrenciesPresenter
import info.alextarasyuk.topcrypts.mvp.presenter.LatestChartPresenter
import javax.inject.Singleton

@Module
class MvpModule {

    @Provides
    @Singleton
    fun provideCurrenciesPresenter(): CurrenciesPresenter = CurrenciesPresenter()

    @Provides
    @Singleton
    fun provideLatestChartPresenter(): LatestChartPresenter = LatestChartPresenter()
}