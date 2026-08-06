package com.bumptech.glide.load.data;

import defpackage.bl8;
import defpackage.o30;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.a<InputStream> {
    public final bl8 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements com.bumptech.glide.load.data.a.InterfaceC0047a<InputStream> {
        public final o30 a;

        public a(o30 o30Var) {
            this.a = o30Var;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0047a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0047a
        public final com.bumptech.glide.load.data.a<InputStream> b(InputStream inputStream) {
            return new c(inputStream, this.a);
        }
    }

    public c(InputStream inputStream, o30 o30Var) {
        bl8 bl8Var = new bl8(inputStream, o30Var);
        this.a = bl8Var;
        bl8Var.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.a
    public final InputStream a() {
        bl8 bl8Var = this.a;
        bl8Var.reset();
        return bl8Var;
    }

    @Override // com.bumptech.glide.load.data.a
    public final void b() {
        this.a.k();
    }
}
