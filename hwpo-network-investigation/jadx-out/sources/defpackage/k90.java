package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k90 extends Exception {
    public final boolean t;

    /* JADX WARN: Illegal instructions before constructor call */
    public k90(int i, int i2, int i3, int i4, id4 id4Var, boolean z, m80.d dVar) {
        StringBuilder sbB = u43.b("AudioTrack init failed 0 Config(", ", ", ", ", i, i2);
        p23.a(sbB, i3, ", ", i4, ") ");
        sbB.append(id4Var);
        sbB.append(z ? " (recoverable)" : BuildConfig.FLAVOR);
        super(sbB.toString(), dVar);
        this.t = z;
    }
}
