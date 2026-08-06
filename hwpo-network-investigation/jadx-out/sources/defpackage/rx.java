package defpackage;

import com.google.android.gms.common.api.Status;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class rx extends Exception {

    @Deprecated
    public final Status t;

    public rx(Status status) {
        int i = status.t;
        String str = status.u;
        str = str == null ? BuildConfig.FLAVOR : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.t = status;
    }
}
