package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yi6 extends m1<String> {
    public final /* synthetic */ aj6 t;

    public yi6(aj6 aj6Var) {
        this.t = aj6Var;
    }

    @Override // defpackage.s0, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // defpackage.s0
    public final int d() {
        return this.t.a.groupCount() + 1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.t.a.group(i);
        return strGroup == null ? BuildConfig.FLAVOR : strGroup;
    }

    @Override // defpackage.m1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // defpackage.m1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
