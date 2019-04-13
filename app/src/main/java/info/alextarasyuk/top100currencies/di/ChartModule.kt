package info.alextarasyuk.top100currencies.di

import dagger.Module
import dagger.Provides
import info.alextarasyuk.top100currencies.chart.LatestChart
import info.alextarasyuk.top100currencies.formatters.YearValueFormatter
import javax.inject.Singleton

@Module
class ChartModule {

    @Provides
    @Singleton
    fun provideLatestChart() = LatestChart()



    @Provides
    @Singleton
    fun provideYearFormatter() = YearValueFormatter()
}