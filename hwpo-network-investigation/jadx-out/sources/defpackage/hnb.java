package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class hnb {
    public static final void a(long j, fl7 fl7Var) {
        if (fl7Var == fl7.t) {
            if (xx1.g(j) != Integer.MAX_VALUE) {
                return;
            }
            xc5.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (xx1.h(j) != Integer.MAX_VALUE) {
                return;
            }
            xc5.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final ox6 b(ox6 ox6Var, go7 go7Var) {
        return ox6Var.H(new ho7(go7Var));
    }

    public static final ox6 c(ox6 ox6Var, omb ombVar) {
        return ox6Var.H(new he5(ombVar));
    }

    public static final File d(Uri uri) throws b3d {
        if (!uri.getScheme().equals("file")) {
            throw new b3d("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new b3d("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new b3d("Did not expect uri to have authority");
    }
}
