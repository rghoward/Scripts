package defpackage;

import android.icu.text.SimpleDateFormat;
import j$.time.LocalDate;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a8 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ a8(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                e8.a aVar = e8.Companion;
                LocalDate localDate = ((p8) obj).g;
                if (localDate == null) {
                    return null;
                }
                String str = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(Long.valueOf(yk2.v(localDate)));
                str.getClass();
                return str;
            default:
                int i = ct8.L;
                return ((dt8) obj).b;
        }
    }
}
