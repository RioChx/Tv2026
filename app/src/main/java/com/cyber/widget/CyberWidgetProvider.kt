package com.cyber.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import android.content.ComponentName

class CyberWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    private fun updateAppWidget(context: Context, appWidgetManager: AppWidgetManager, appWidgetId: Int) {
        val views = RemoteViews(context.packageName, R.layout.widget_layout)
        
        // This links to your 'Main Override' text in the layout
        views.setTextViewText(R.id.widget_text, "CYBER_ART_2026")
        
        appWidgetManager.updateAppWidget(appWidgetId, views)
    }
}
