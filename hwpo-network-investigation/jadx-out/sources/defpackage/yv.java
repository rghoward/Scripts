package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yv<T, V extends fw> implements yz9<T> {
    public final cza<T, V> t;
    public final dt7 u;
    public V v;
    public long w;
    public long x;
    public boolean y;

    public yv(cza<T, V> czaVar, T t, V v, long j, long j2, boolean z) {
        V vInvoke;
        this.t = czaVar;
        this.u = bl7.i(t);
        if (v != null) {
            vInvoke = (V) gw.b(v);
        } else {
            vInvoke = czaVar.a().invoke(t);
            vInvoke.d();
        }
        this.v = vInvoke;
        this.w = j;
        this.x = j2;
        this.y = z;
    }

    public final T d() {
        return this.t.b().invoke(this.v);
    }

    @Override // defpackage.yz9
    public final T getValue() {
        return this.u.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(this.u.getValue());
        sb.append(", velocity=");
        sb.append(d());
        sb.append(", isRunning=");
        sb.append(this.y);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.w);
        sb.append(", finishedTimeNanos=");
        return fh0.b(sb, this.x, ')');
    }

    public /* synthetic */ yv(cza czaVar, Object obj, fw fwVar, int i) {
        this(czaVar, obj, (i & 4) != 0 ? null : fwVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
