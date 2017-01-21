/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.sonyericsson.extras.liveware.sdk;

public final class R {
    public static final class attr {
        /**  Path in the asset folder to custom font to use instead of the device default font. The font will not be rendered in the layout editor. 
 Example 
 widgets:fontPath="comic.ttf" 
         <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int fontPath=0x7f010006;
        /**  Specifies how to place the content of an object, both
         on the x- and y-axis, within the object itself. 
         <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>top</code></td><td>0x30</td><td> Push object to the top of its container, not changing its size. </td></tr>
<tr><td><code>bottom</code></td><td>0x50</td><td> Push object to the bottom of its container, not changing its size. </td></tr>
<tr><td><code>left</code></td><td>0x03</td><td> Push object to the left of its container, not changing its size. </td></tr>
<tr><td><code>right</code></td><td>0x05</td><td> Push object to the right of its container, not changing its size. </td></tr>
<tr><td><code>center_vertical</code></td><td>0x10</td><td> Place object in the vertical center of its container, not changing its size. </td></tr>
<tr><td><code>center_horizontal</code></td><td>0x01</td><td> Place object in the horizontal center of its container, not changing its size. </td></tr>
<tr><td><code>center</code></td><td>0x11</td><td> Place the object in the center of its container in both the vertical and horizontal axis, not changing its size. </td></tr>
</table>
         */
        public static int gravity=0x7f010000;
        /**  Formatting template for default values. Accepts DateFormat formatting. 
 Example 
 widgets:timeType="months" 
 widgets:template="MM"  
         <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int template=0x7f010005;
        /**  An array of strings that should be displayed over time. It should have the same number of strings as the number of states indicated by the timeType. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int textArray=0x7f010003;
        /**  The font size. Use pixels to prevent scaling. 
         <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
<p>May be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>match_parent</code></td><td>-1</td><td> The view should be as big as its parent (minus padding). It will make the view find a size that allows for the current text to fit within the parent. </td></tr>
</table>
         */
        public static int textSize=0x7f010002;
        /**  Offsets the time forwards or backwards by a number of seconds. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int timeOffset=0x7f010001;
        /**  Type indicating which time period the view should represent. 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>constant</code></td><td>0</td><td> Indicates that the view is not changing with time. It has 1 state. </td></tr>
<tr><td><code>seconds</code></td><td>1</td><td> Makes the view represent the seconds of a clock. It has 60 states. If only one background resource is provided for this type, the other 59 resources will be created by rotating the initial resource. Due to battery constraints, this timeType may not be visible at all times. </td></tr>
<tr><td><code>seconds_digit2</code></td><td>2</td><td> Makes the view represent the ten part of seconds. It has 6 states. </td></tr>
<tr><td><code>seconds_digit1</code></td><td>3</td><td> Makes the view represent the one part of seconds. It has 10 states. </td></tr>
<tr><td><code>minutes</code></td><td>4</td><td> Makes the view represent the minutes of a clock. It has 60 states. If only one background resource is provided for this type, the other 59 resources will be created by rotating the initial resource </td></tr>
<tr><td><code>minutes_digit2</code></td><td>5</td><td> Makes the view represent the ten part of seconds. It has 6 states. </td></tr>
<tr><td><code>minutes_digit1</code></td><td>6</td><td> Makes the view represent the one part of seconds. It has 10 states. </td></tr>
<tr><td><code>hours</code></td><td>7</td><td> Makes the view represent the hours of a clock. It has 24 states. </td></tr>
<tr><td><code>hours_digit2</code></td><td>8</td><td> Makes the view represent the one part of hours. It has 3 states. </td></tr>
<tr><td><code>hours_digit1</code></td><td>9</td><td> Makes the view represent the ten part of hours. It has 10 states. </td></tr>
<tr><td><code>days_of_week</code></td><td>10</td><td> Makes the view represent the days of the week. It has 7 states. </td></tr>
<tr><td><code>days_of_month</code></td><td>11</td><td> Makes the view represent the days of the month. It has 31 states. </td></tr>
<tr><td><code>days_of_month_digit2</code></td><td>12</td><td> Makes the view represent the one part of the days of the month. It has 4 states. </td></tr>
<tr><td><code>days_of_month_digit1</code></td><td>13</td><td> Makes the view represent the ten part of the days of the month. It has 10 states. </td></tr>
<tr><td><code>days_of_year</code></td><td>14</td><td> Makes the view represent the days of the year. It has 366 states. </td></tr>
<tr><td><code>days_of_year_digit3</code></td><td>15</td><td> Makes the view represent the hundred part of the days of the year. It has 4 states. </td></tr>
<tr><td><code>days_of_year_digit2</code></td><td>16</td><td> Makes the view represent the ten part of the days of the year. It has 10 states. </td></tr>
<tr><td><code>days_of_year_digit1</code></td><td>17</td><td> Makes the view represent the one part of the days of the year. It has 10 states. </td></tr>
<tr><td><code>months</code></td><td>18</td><td> Makes the view represent the months of the year. It has 12 states. </td></tr>
<tr><td><code>months_digit2</code></td><td>19</td><td> Makes the view represent the ten part of the months of the year. It has 2 states. </td></tr>
<tr><td><code>months_digit1</code></td><td>20</td><td> Makes the view represent the one part of the months of the year. It has 10 states. </td></tr>
<tr><td><code>years_digit4</code></td><td>21</td><td> Makes the view represent the thousand part of the years. It has 10 states. </td></tr>
<tr><td><code>years_digit3</code></td><td>22</td><td> Makes the view represent the hundred part of the years. It has 10 states. </td></tr>
<tr><td><code>years_digit2</code></td><td>23</td><td> Makes the view represent the ten part of the years. It has 10 states. </td></tr>
<tr><td><code>years_digit1</code></td><td>24</td><td> Makes the view represent the one part of the years. It has 10 states. </td></tr>
<tr><td><code>am_pm</code></td><td>25</td><td> Makes the view represent the AM/PM part of a clock. It has 2 states. </td></tr>
<tr><td><code>hours_fine</code></td><td>26</td><td> Makes the view represent the hours of a clock, switching every 12 minutes. It has 60 states. If only one background resource is provided for this type, the other 59 resources will be created by rotating the initial resource. </td></tr>
</table>
         */
        public static int timeType=0x7f010004;
    }
    public static final class id {
        public static int am_pm=0x7f030008;
        public static int bottom=0x7f030000;
        public static int center=0x7f030001;
        public static int center_horizontal=0x7f030002;
        public static int center_vertical=0x7f030003;
        public static int constant=0x7f030009;
        public static int days_of_month=0x7f03000a;
        public static int days_of_month_digit1=0x7f03000b;
        public static int days_of_month_digit2=0x7f03000c;
        public static int days_of_week=0x7f03000d;
        public static int days_of_year=0x7f03000e;
        public static int days_of_year_digit1=0x7f03000f;
        public static int days_of_year_digit2=0x7f030010;
        public static int days_of_year_digit3=0x7f030011;
        public static int hours=0x7f030012;
        public static int hours_digit1=0x7f030013;
        public static int hours_digit2=0x7f030014;
        public static int hours_fine=0x7f030015;
        public static int left=0x7f030004;
        public static int match_parent=0x7f030007;
        public static int minutes=0x7f030016;
        public static int minutes_digit1=0x7f030017;
        public static int minutes_digit2=0x7f030018;
        public static int months=0x7f030019;
        public static int months_digit1=0x7f03001a;
        public static int months_digit2=0x7f03001b;
        public static int right=0x7f030005;
        public static int seconds=0x7f03001c;
        public static int seconds_digit1=0x7f03001d;
        public static int seconds_digit2=0x7f03001e;
        public static int top=0x7f030006;
        public static int years_digit1=0x7f03001f;
        public static int years_digit2=0x7f030020;
        public static int years_digit3=0x7f030021;
        public static int years_digit4=0x7f030022;
    }
    public static final class string {
        /**  At least one dummy resource is needed to satisfy aapt.
    Otherwise it complains about no res folder. 
         */
        public static int app_name=0x7f020000;
    }
    public static final class styleable {
        /** Attributes that can be used with a TimeLayout.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #TimeLayout_gravity com.sonyericsson.extras.liveware.sdk:gravity}</code></td><td> Specifies how to place the content of an object, both
         on the x- and y-axis, within the object itself.</td></tr>
           <tr><td><code>{@link #TimeLayout_timeOffset com.sonyericsson.extras.liveware.sdk:timeOffset}</code></td><td> Offsets the time forwards or backwards by a number of seconds.</td></tr>
           </table>
           @see #TimeLayout_gravity
           @see #TimeLayout_timeOffset
         */
        public static final int[] TimeLayout = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>
          @attr description
           Specifies how to place the content of an object, both
         on the x- and y-axis, within the object itself. 


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>top</code></td><td>0x30</td><td> Push object to the top of its container, not changing its size. </td></tr>
<tr><td><code>bottom</code></td><td>0x50</td><td> Push object to the bottom of its container, not changing its size. </td></tr>
<tr><td><code>left</code></td><td>0x03</td><td> Push object to the left of its container, not changing its size. </td></tr>
<tr><td><code>right</code></td><td>0x05</td><td> Push object to the right of its container, not changing its size. </td></tr>
<tr><td><code>center_vertical</code></td><td>0x10</td><td> Place object in the vertical center of its container, not changing its size. </td></tr>
<tr><td><code>center_horizontal</code></td><td>0x01</td><td> Place object in the horizontal center of its container, not changing its size. </td></tr>
<tr><td><code>center</code></td><td>0x11</td><td> Place the object in the center of its container in both the vertical and horizontal axis, not changing its size. </td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.sonyericsson.extras.liveware.sdk:gravity
        */
        public static int TimeLayout_gravity = 0;
        /**
          <p>
          @attr description
           Offsets the time forwards or backwards by a number of seconds. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.sonyericsson.extras.liveware.sdk:timeOffset
        */
        public static int TimeLayout_timeOffset = 1;
        /** Attributes that can be used with a TimeView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #TimeView_fontPath com.sonyericsson.extras.liveware.sdk:fontPath}</code></td><td> Path in the asset folder to custom font to use instead of the device default font.</td></tr>
           <tr><td><code>{@link #TimeView_template com.sonyericsson.extras.liveware.sdk:template}</code></td><td> Formatting template for default values.</td></tr>
           <tr><td><code>{@link #TimeView_textArray com.sonyericsson.extras.liveware.sdk:textArray}</code></td><td> An array of strings that should be displayed over time.</td></tr>
           <tr><td><code>{@link #TimeView_textSize com.sonyericsson.extras.liveware.sdk:textSize}</code></td><td> The font size.</td></tr>
           <tr><td><code>{@link #TimeView_timeType com.sonyericsson.extras.liveware.sdk:timeType}</code></td><td> Type indicating which time period the view should represent.</td></tr>
           </table>
           @see #TimeView_fontPath
           @see #TimeView_template
           @see #TimeView_textArray
           @see #TimeView_textSize
           @see #TimeView_timeType
         */
        public static final int[] TimeView = {
            0x7f010002, 0x7f010003, 0x7f010004, 0x7f010005,
            0x7f010006
        };
        /**
          <p>
          @attr description
           Path in the asset folder to custom font to use instead of the device default font. The font will not be rendered in the layout editor. 
 Example 
 widgets:fontPath="comic.ttf" 


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.sonyericsson.extras.liveware.sdk:fontPath
        */
        public static int TimeView_fontPath = 4;
        /**
          <p>
          @attr description
           Formatting template for default values. Accepts DateFormat formatting. 
 Example 
 widgets:timeType="months" 
 widgets:template="MM"  


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.sonyericsson.extras.liveware.sdk:template
        */
        public static int TimeView_template = 3;
        /**
          <p>
          @attr description
           An array of strings that should be displayed over time. It should have the same number of strings as the number of states indicated by the timeType. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.sonyericsson.extras.liveware.sdk:textArray
        */
        public static int TimeView_textArray = 1;
        /**
          <p>
          @attr description
           The font size. Use pixels to prevent scaling. 


          <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
<p>May be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>match_parent</code></td><td>-1</td><td> The view should be as big as its parent (minus padding). It will make the view find a size that allows for the current text to fit within the parent. </td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.sonyericsson.extras.liveware.sdk:textSize
        */
        public static int TimeView_textSize = 0;
        /**
          <p>
          @attr description
           Type indicating which time period the view should represent. 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>constant</code></td><td>0</td><td> Indicates that the view is not changing with time. It has 1 state. </td></tr>
<tr><td><code>seconds</code></td><td>1</td><td> Makes the view represent the seconds of a clock. It has 60 states. If only one background resource is provided for this type, the other 59 resources will be created by rotating the initial resource. Due to battery constraints, this timeType may not be visible at all times. </td></tr>
<tr><td><code>seconds_digit2</code></td><td>2</td><td> Makes the view represent the ten part of seconds. It has 6 states. </td></tr>
<tr><td><code>seconds_digit1</code></td><td>3</td><td> Makes the view represent the one part of seconds. It has 10 states. </td></tr>
<tr><td><code>minutes</code></td><td>4</td><td> Makes the view represent the minutes of a clock. It has 60 states. If only one background resource is provided for this type, the other 59 resources will be created by rotating the initial resource </td></tr>
<tr><td><code>minutes_digit2</code></td><td>5</td><td> Makes the view represent the ten part of seconds. It has 6 states. </td></tr>
<tr><td><code>minutes_digit1</code></td><td>6</td><td> Makes the view represent the one part of seconds. It has 10 states. </td></tr>
<tr><td><code>hours</code></td><td>7</td><td> Makes the view represent the hours of a clock. It has 24 states. </td></tr>
<tr><td><code>hours_digit2</code></td><td>8</td><td> Makes the view represent the one part of hours. It has 3 states. </td></tr>
<tr><td><code>hours_digit1</code></td><td>9</td><td> Makes the view represent the ten part of hours. It has 10 states. </td></tr>
<tr><td><code>days_of_week</code></td><td>10</td><td> Makes the view represent the days of the week. It has 7 states. </td></tr>
<tr><td><code>days_of_month</code></td><td>11</td><td> Makes the view represent the days of the month. It has 31 states. </td></tr>
<tr><td><code>days_of_month_digit2</code></td><td>12</td><td> Makes the view represent the one part of the days of the month. It has 4 states. </td></tr>
<tr><td><code>days_of_month_digit1</code></td><td>13</td><td> Makes the view represent the ten part of the days of the month. It has 10 states. </td></tr>
<tr><td><code>days_of_year</code></td><td>14</td><td> Makes the view represent the days of the year. It has 366 states. </td></tr>
<tr><td><code>days_of_year_digit3</code></td><td>15</td><td> Makes the view represent the hundred part of the days of the year. It has 4 states. </td></tr>
<tr><td><code>days_of_year_digit2</code></td><td>16</td><td> Makes the view represent the ten part of the days of the year. It has 10 states. </td></tr>
<tr><td><code>days_of_year_digit1</code></td><td>17</td><td> Makes the view represent the one part of the days of the year. It has 10 states. </td></tr>
<tr><td><code>months</code></td><td>18</td><td> Makes the view represent the months of the year. It has 12 states. </td></tr>
<tr><td><code>months_digit2</code></td><td>19</td><td> Makes the view represent the ten part of the months of the year. It has 2 states. </td></tr>
<tr><td><code>months_digit1</code></td><td>20</td><td> Makes the view represent the one part of the months of the year. It has 10 states. </td></tr>
<tr><td><code>years_digit4</code></td><td>21</td><td> Makes the view represent the thousand part of the years. It has 10 states. </td></tr>
<tr><td><code>years_digit3</code></td><td>22</td><td> Makes the view represent the hundred part of the years. It has 10 states. </td></tr>
<tr><td><code>years_digit2</code></td><td>23</td><td> Makes the view represent the ten part of the years. It has 10 states. </td></tr>
<tr><td><code>years_digit1</code></td><td>24</td><td> Makes the view represent the one part of the years. It has 10 states. </td></tr>
<tr><td><code>am_pm</code></td><td>25</td><td> Makes the view represent the AM/PM part of a clock. It has 2 states. </td></tr>
<tr><td><code>hours_fine</code></td><td>26</td><td> Makes the view represent the hours of a clock, switching every 12 minutes. It has 60 states. If only one background resource is provided for this type, the other 59 resources will be created by rotating the initial resource. </td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.sonyericsson.extras.liveware.sdk:timeType
        */
        public static int TimeView_timeType = 2;
    };
}
