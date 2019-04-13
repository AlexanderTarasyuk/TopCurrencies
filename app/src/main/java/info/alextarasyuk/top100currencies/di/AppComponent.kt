package info.alextarasyuk.top100currencies.di

import dagger.Component
import info.alextarasyuk.top100currencies.activities.ChartActivity
import info.alextarasyuk.top100currencies.activities.MainActivity
import info.alextarasyuk.top100currencies.chart.LatestChart
import info.alextarasyuk.top100currencies.fragments.CurrenciesListFragment
import info.alextarasyuk.top100currencies.mvp.presenter.CurrenciesPresenter
import info.alextarasyuk.topcrypts.mvp.presenter.LatestChartPresenter
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class, RestModule::class, MvpModule::class, ChartModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(activity: ChartActivity)

    fun inject(fragment: CurrenciesListFragment)

    fun inject(presenter: CurrenciesPresenter)
    fun inject(presenter: LatestChartPresenter)

    fun inject(chart: LatestChart)

}