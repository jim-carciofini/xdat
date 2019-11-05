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

package org.xdat.actionListeners.parallelCoordinatesChartFrame;

import org.xdat.Main;
import org.xdat.gui.dialogs.ClusterDialog;
import org.xdat.gui.frames.ChartFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChartFrameClusteringMenuActionListener implements ActionListener {

	private Main mainWindow;
	private ChartFrame chartFrame;

	public ChartFrameClusteringMenuActionListener(Main mainWindow, ChartFrame chartFrame) {
		this.mainWindow = mainWindow;
		this.chartFrame = chartFrame;
	}

	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Edit Clusters")) {
			new ClusterDialog(this.chartFrame, this.mainWindow);
		}

	}
}
