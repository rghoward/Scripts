package com.hwpo_training_app.core.data.model.user;

import defpackage.f93;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.uj4;
import defpackage.vj4;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public abstract class GenderNetworkEntity implements f93<uj4> {
    public static final Companion Companion;
    public static final ss5<KSerializer<Object>> u;
    public static final b v;
    public static final a w;
    public static final c x;
    public static final /* synthetic */ GenderNetworkEntity[] y;
    public final String t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<GenderNetworkEntity> serializer() {
            return (KSerializer) GenderNetworkEntity.u.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends GenderNetworkEntity {
        @Override // defpackage.f93
        public final uj4 a() {
            return uj4.u;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends GenderNetworkEntity {
        @Override // defpackage.f93
        public final uj4 a() {
            return uj4.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends GenderNetworkEntity {
        @Override // defpackage.f93
        public final uj4 a() {
            return uj4.v;
        }
    }

    static {
        b bVar = new b("MALE", 0, "male");
        v = bVar;
        a aVar = new a("FEMALE", 1, "female");
        w = aVar;
        c cVar = new c("OTHER", 2, "other");
        x = cVar;
        y = new GenderNetworkEntity[]{bVar, aVar, cVar};
        Companion = new Companion();
        u = hv5.c(j26.t, new vj4());
    }

    public GenderNetworkEntity() {
        throw null;
    }

    public GenderNetworkEntity(String str, int i, String str2) {
        super(str, i);
        this.t = str2;
    }

    public static GenderNetworkEntity valueOf(String str) {
        return (GenderNetworkEntity) Enum.valueOf(GenderNetworkEntity.class, str);
    }

    public static GenderNetworkEntity[] values() {
        return (GenderNetworkEntity[]) y.clone();
    }
}
