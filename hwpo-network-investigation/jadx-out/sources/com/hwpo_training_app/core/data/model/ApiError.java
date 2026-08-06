package com.hwpo_training_app.core.data.model;

import defpackage.f93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.px;
import defpackage.qx;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.tl3;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ApiError implements f93<tl3> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] v = {null, hv5.c(j26.t, new px(0))};
    public final String t;
    public final Placement u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ApiError> serializer() {
            return ApiError$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @rd9
    public static abstract class Placement implements f93<tl3.a> {
        public static final Companion Companion;
        public static final ss5<KSerializer<Object>> t;
        public static final b u;
        public static final /* synthetic */ Placement[] v;

        /* JADX INFO: Fake field, exist only in values array */
        Placement EF0;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Companion {
            public final KSerializer<Placement> serializer() {
                return (KSerializer) Placement.t.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends Placement {
            public a() {
                super("FIELD", 0);
            }

            @Override // defpackage.f93
            public final tl3.a a() {
                return tl3.a.t;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends Placement {
            public b() {
                super("SNACKBAR", 1);
            }

            @Override // defpackage.f93
            public final tl3.a a() {
                return tl3.a.u;
            }
        }

        static {
            a aVar = new a();
            b bVar = new b();
            u = bVar;
            v = new Placement[]{aVar, bVar};
            Companion = new Companion();
            t = hv5.c(j26.t, new qx());
        }

        public Placement() {
            throw null;
        }

        public static Placement valueOf(String str) {
            return (Placement) Enum.valueOf(Placement.class, str);
        }

        public static Placement[] values() {
            return (Placement[]) v.clone();
        }
    }

    public /* synthetic */ ApiError(int i, String str, Placement placement) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, ApiError$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = str;
        this.u = placement;
    }

    @Override // defpackage.f93
    public final tl3 a() {
        return new tl3(this.t, this.u.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiError)) {
            return false;
        }
        ApiError apiError = (ApiError) obj;
        return xj5.a(this.t, apiError.t) && this.u == apiError.u;
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }

    public final String toString() {
        return "ApiError(detail=" + this.t + ", placement=" + this.u + ")";
    }

    public ApiError(String str, Placement.b bVar) {
        str.getClass();
        bVar.getClass();
        this.t = str;
        this.u = bVar;
    }
}
