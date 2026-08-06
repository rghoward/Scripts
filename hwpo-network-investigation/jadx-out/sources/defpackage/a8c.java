package defpackage;

import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface a8c {
    public static final k8c l = new k8c();
    public static final w7c m = new w7c();
    public static final d4c n = new d4c(ActionType.CONTINUE);
    public static final d4c o = new d4c("break");
    public static final d4c p = new d4c("return");
    public static final b3c q = new b3c(Boolean.TRUE);
    public static final b3c r = new b3c(Boolean.FALSE);
    public static final i8c s = new i8c(BuildConfig.FLAVOR);

    String c();

    Double d();

    Boolean e();

    Iterator f();

    a8c j(String str, cgc cgcVar, ArrayList arrayList);

    a8c n();
}
