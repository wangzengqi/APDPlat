/**
 * 
 * APDPlat - Application Product Development Platform
 * Copyright (c) 2013, 杨尚川, yang-shangchuan@qq.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package org.apdplat.platform.util;

import static junit.framework.Assert.*;
import org.junit.Test;

/**
 *
 * @author 杨尚川
 */
public class AddLicenceForSourceFileTest {
    @Test
    public void testProcessJavaFile(){
        try{
            AddLicenceForSourceFile.processJavaFile();
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    @Test
    public void testProcessJspFile(){
        try{
            AddLicenceForSourceFile.processJspFile();
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    @Test
    public void testProcessJsFile(){
        try{
            AddLicenceForSourceFile.processJsFile();
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
}