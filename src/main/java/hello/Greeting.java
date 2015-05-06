/* 
* @Author: yhf
* @Date:   2015-05-06 23:34:50
* @Last Modified by:   yhf
* @Last Modified time: 2015-05-06 23:46:16
*/

package hello;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
