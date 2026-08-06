package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import defpackage.hg3;
import defpackage.kk4;
import defpackage.kq8;
import defpackage.m20;
import defpackage.o30;
import defpackage.oq8;
import defpackage.rwa;
import defpackage.sl8;
import defpackage.tl8;
import defpackage.um4;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {
    public static final kk4 k = new kk4();
    public final o30 a;
    public final um4 b;
    public final m20 c;
    public final a.InterfaceC0045a d;
    public final List<kq8<Object>> e;
    public final Map<Class<?>, rwa<?, ?>> f;
    public final hg3 g;
    public final d h;
    public final int i;
    public oq8 j;

    public c(Context context, o30 o30Var, tl8 tl8Var, m20 m20Var, a.InterfaceC0045a interfaceC0045a, Map map, List list, hg3 hg3Var, d dVar, int i) {
        super(context.getApplicationContext());
        this.a = o30Var;
        this.c = m20Var;
        this.d = interfaceC0045a;
        this.e = list;
        this.f = map;
        this.g = hg3Var;
        this.h = dVar;
        this.i = i;
        this.b = new um4(tl8Var);
    }

    public final sl8 a() {
        return (sl8) this.b.get();
    }
}
