package com.bumptech.glide.load.data;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final a b = new a();
    public final HashMap a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements com.bumptech.glide.load.data.a.InterfaceC0047a<Object> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0047a
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0047a
        public final com.bumptech.glide.load.data.a<Object> b(Object obj) {
            return new C0048b(obj);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class C0048b implements com.bumptech.glide.load.data.a<Object> {
        public final Object a;

        public C0048b(Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.a
        public final Object a() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.data.a
        public final void b() {
        }
    }
}
