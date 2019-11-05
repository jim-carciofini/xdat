/*
 *  Copyright 2014, Enguerrand de Rochefort
 * 
 * This file is part of xdat.
 *
 * xdat is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * xdat is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with xdat.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package org.xdat.actionListeners.mainMenu;

import org.xdat.Main;
import org.xdat.chart.Chart;
import org.xdat.chart.ParallelCoordinatesChart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainDataRemoveParameterMenuActionListener implements ActionListener {

	private Main mainWindow;

	public MainDataRemoveParameterMenuActionListener(Main mainWindow) {
		this.mainWindow = mainWindow;

	}

	public void actionPerformed(ActionEvent e) {
		String paramName = e.getActionCommand();
		Chart[] charts = new Chart[this.mainWindow.getCurrentSession().getChartCount()];
		for (int i = 0; i < charts.length; i++) {
			charts[i] = (this.mainWindow.getCurrentSession().getChart(i));
			if (charts[i].getClass().equals(ParallelCoordinatesChart.class)) {
				((ParallelCoordinatesChart) charts[i]).removeAxis(paramName);
			}
		}
	}
}
