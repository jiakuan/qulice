/**
 * Hello.
 */
package foo.bar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Better to use diamond operator where possible.
 *
 * @author John Smith (john@example.com)
 * @version $Id$
 * @since 1.0
 */
public final class InvalidDiamondsUsage {

    @Override
    public List<String> firstTen(final String... args) {
        final List<String> list = new ArrayList<String>(args.length);
        list.addAll(Arrays.asList(args));
        return list;
    }
}
