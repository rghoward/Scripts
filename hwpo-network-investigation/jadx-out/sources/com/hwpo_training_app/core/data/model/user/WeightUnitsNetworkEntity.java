package com.hwpo_training_app.core.data.model.user;

import defpackage.f93;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.vl9;
import defpackage.ylb;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public abstract class WeightUnitsNetworkEntity implements f93<ylb> {
    public static final Companion Companion;
    public static final ss5<KSerializer<Object>> u;
    public static final a v;
    public static final b w;
    public static final /* synthetic */ WeightUnitsNetworkEntity[] x;
    public final String t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<WeightUnitsNetworkEntity> serializer() {
            return (KSerializer) WeightUnitsNetworkEntity.u.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends WeightUnitsNetworkEntity {
        @Override // defpackage.f93
        public final ylb a() {
            return ylb.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends WeightUnitsNetworkEntity {
        @Override // defpackage.f93
        public final ylb a() {
            return ylb.u;
        }
    }

    static {
        a aVar = new a("KG", 0, "kilogram");
        v = aVar;
        b bVar = new b("POUND", 1, "pound");
        w = bVar;
        x = new WeightUnitsNetworkEntity[]{aVar, bVar};
        Companion = new Companion();
        u = hv5.c(j26.t, new vl9(1));
    }

    public WeightUnitsNetworkEntity() {
        throw null;
    }

    public WeightUnitsNetworkEntity(String str, int i, String str2) {
        super(str, i);
        this.t = str2;
    }

    public static WeightUnitsNetworkEntity valueOf(String str) {
        return (WeightUnitsNetworkEntity) Enum.valueOf(WeightUnitsNetworkEntity.class, str);
    }

    public static WeightUnitsNetworkEntity[] values() {
        return (WeightUnitsNetworkEntity[]) x.clone();
    }
}
