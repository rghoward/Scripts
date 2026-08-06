package defpackage;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j4d {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Executor b;
    public final j2d c;
    public final i4d d;
    public final HashMap e;

    public j4d(ib6 ib6Var, j2d j2dVar, t5d t5dVar, HashMap map) {
        ib6Var.getClass();
        this.b = ib6Var;
        j2dVar.getClass();
        this.c = j2dVar;
        t5dVar.getClass();
        this.e = map;
        xl7.g(!map.isEmpty());
        this.d = i4d.a;
    }
}
