package com.example.donny.labela.ui.list.di

import com.example.donny.labela.ui.list.ListActivity
import dagger.Component
import dagger.Subcomponent

@Component(modules = [ListModule::class])
interface ListComponent {

    fun inject(activity: ListActivity)

}