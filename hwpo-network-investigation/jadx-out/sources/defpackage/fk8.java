package defpackage;

import android.content.Context;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk8 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ fk8(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[LOOP:0: B:9:0x0021->B:19:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[SYNTHETIC] */
    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                d37 d37Var = (d37) obj2;
                x02 x02Var = (x02) obj;
                Object[] objArr = d37Var.b;
                long[] jArr = d37Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    x02Var.p(objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                return g2b.a;
            default:
                return TeamPresenceComponentKt.TeamPresenceComponent$lambda$5$lambda$4$lambda$3((ArticleViewState.TeamPresenceState) obj2, (Context) obj);
        }
    }
}
