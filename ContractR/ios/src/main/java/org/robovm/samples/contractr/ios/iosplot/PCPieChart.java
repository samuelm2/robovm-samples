/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.samples.contractr.ios.iosplot;

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSMutableArray;
import org.robovm.apple.uikit.UIFont;
import org.robovm.apple.uikit.UIView;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Library;

/**
 * 
 */
@Library(Library.INTERNAL)
@NativeClass
public class PCPieChart extends UIView {

    public PCPieChart() {
    }

    public PCPieChart(CGRect frame) {
        super(frame);
    }

    @Property
    public native int getDiameter();

    @Property
    public native void setDiameter(int diameter);

    @Property
    public native NSMutableArray<PCPieComponent> getComponents();

    @Property
    public native void setComponents(NSMutableArray<PCPieComponent> components);

    @Property
    public native UIFont getTitleFont();

    @Property
    public native void setTitleFont(UIFont titleFont);

    @Property
    public native UIFont getPercentageFont();

    @Property
    public native void setPercentageFont(UIFont percentageFont);
    
}