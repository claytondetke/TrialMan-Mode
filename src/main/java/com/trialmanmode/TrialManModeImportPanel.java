/*
 * Copyright (c) 2018, TheLonelyDev <https://github.com/TheLonelyDev>
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2020, ConorLeckey <https://github.com/ConorLeckey>
 * Copyright (c) 2022, Clayton Detke <https://github.com/claytondetke>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.trialmanmode;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;

import javax.inject.Singleton;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

@Slf4j
@Singleton
public class TrialManModeImportPanel extends PluginPanel {
    private final TrialManModePlugin plugin;

    public TrialManModeImportPanel(TrialManModePlugin plugin) {
        this.plugin = plugin;

        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel northPanel = new JPanel(new BorderLayout());
        northPanel.setBorder(new EmptyBorder(1, 0, 10, 0));

        JLabel title = new JLabel();
        title.setText("TrialMan Mode Import Panel");
        title.setForeground(Color.WHITE);

        northPanel.add(title, BorderLayout.NORTH);

        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        infoPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        infoPanel.setLayout(new GridLayout(0, 1));

        JLabel info = new JLabel(htmlLabel("Clicking either of the Import buttons below will migrate all tiles marked using either the Ground Markers plugin or the TileMan Mode plugin into the TrialMan Mode plugin. They will NOT be removed from the either Plugin.", "#FFFFFF"));

        JLabel warning = new JLabel(htmlLabel("WARNING: This directly modifies RuneLite's settings.properties file. You should make a back up before importing.", "#FFFF00"));

        infoPanel.add(info);
        infoPanel.add(warning);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(ColorScheme.DARK_GRAY_COLOR);

        JButton importButtonGroundMarkers = new JButton("Import from Ground Markers");
        centerPanel.add(importButtonGroundMarkers);
        importButtonGroundMarkers.addActionListener(l -> plugin.importGroundMarkerTiles());

        JButton importButtonTileMan = new JButton("Import from Tileman Mode");
        centerPanel.add(importButtonTileMan, BorderLayout.SOUTH);
        importButtonTileMan.addActionListener(l -> plugin.importTilemanModeTiles());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridx = 0;
        constraints.gridy = 0;

        importButtonGroundMarkers.setToolTipText("Import Ground Markers");
        importButtonTileMan.setToolTipText("Import Tileman Mode Tiles");

        add(northPanel, BorderLayout.NORTH);
        add(infoPanel, BorderLayout.CENTER);
        add(centerPanel, BorderLayout.SOUTH);
    }


    private static String htmlLabel(String key, String color) {
        return "<html><body style = 'color:" + color + "'>" + key + "</body></html>";
    }
}