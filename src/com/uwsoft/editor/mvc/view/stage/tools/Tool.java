/*
 * ******************************************************************************
 *  * Copyright 2015 See AUTHORS file.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *****************************************************************************
 */

package com.uwsoft.editor.mvc.view.stage.tools;

import com.uwsoft.editor.renderer.actor.IBaseItem;

/**
 * Created by azakhary on 4/30/2015.
 */
public interface Tool {
    public void initTool();
    public boolean stageMouseDown(float x, float y);
    public void stageMouseUp(float x, float y);
    public void stageMouseDragged(float x, float y);
    public void stageMouseDoubleClick(float x, float y);
    public boolean itemMouseDown(IBaseItem item, float x, float y);
    public void itemMouseUp(IBaseItem item, float x, float y);
    public void itemMouseDragged(IBaseItem item, float x, float y);
    public void itemMouseDoubleClick(IBaseItem item, float x, float y);
}
