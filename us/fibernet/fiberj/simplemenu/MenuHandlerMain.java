/*
 * Copyright Wen Bian. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 * - Redistributions of source code must retain the above copyright notice, this list
 *   of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above copyright notice, this
 *   list of conditions and the following disclaimer listed in this license in the
 *   documentation and/or other materials provided with the distribution.
 *
 * - Neither the name of the copyright holders nor the names of its contributors may
 *   be used to endorse or promote products derived from this software without specific
 *   prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package us.fibernet.fiberj.simplemenu;

/**
 * A default menu handler (adapter) for the MenuMain.
 */
public class MenuHandlerMain implements MenuHandler {

    public void fileOpen() {}
    public void fileSave() {}
    public void fileClose() {}
    public void fileExit() {}

    public void imageFlip() {}
    public void imageRotate() {}
    public void imageResize() {}
    public void imageCrop() {}

    public void colormapLoad() {}
    public void colormapSave() {}
    public void colormapCustomize() {}

    public void drawCircle() {}
    public void drawResolutionCircle() {}
    public void drawLayerline() {}
    public void drawRefresh() {}
    public void drawClearAll() {}

    public void processFilter() {}
    public void processPlot() {}
    public void processCorrection() {}
    public void processTransform() {}
    public void processBackground() {}

    public void windowParameter() {}
    public void windowCoordinates() {}
    public void windowPixelViewer() {}
    public void windowLog() {}

    public void helpAbout() {}
    public void helpResource() {}
}
