package com.hwpo_training_app.core.data.model.user;

import defpackage.f93;
import defpackage.hv5;
import defpackage.j26;
import defpackage.l66;
import defpackage.n33;
import defpackage.rd9;
import defpackage.ss5;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public abstract class LengthUnitsNetworkEntity implements f93<n33> {
    public static final Companion Companion;
    public static final ss5<KSerializer<Object>> u;
    public static final a v;
    public static final b w;
    public static final /* synthetic */ LengthUnitsNetworkEntity[] x;
    public final String t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<LengthUnitsNetworkEntity> serializer() {
            return (KSerializer) LengthUnitsNetworkEntity.u.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends LengthUnitsNetworkEntity {
        @Override // defpackage.f93
        public final n33 a() {
            return n33.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends LengthUnitsNetworkEntity {
        @Override // defpackage.f93
        public final n33 a() {
            return n33.u;
        }
    }

    static {
        a aVar = new a("METER", 0, "meter");
        v = aVar;
        b bVar = new b("YARD", 1, "yard");
        w = bVar;
        x = new LengthUnitsNetworkEntity[]{aVar, bVar};
        Companion = new Companion();
        u = hv5.c(j26.t, new l66(0));
    }

    public LengthUnitsNetworkEntity() {
        throw null;
    }

    public LengthUnitsNetworkEntity(String str, int i, String str2) {
        super(str, i);
        this.t = str2;
    }

    public static LengthUnitsNetworkEntity valueOf(String str) {
        return (LengthUnitsNetworkEntity) Enum.valueOf(LengthUnitsNetworkEntity.class, str);
    }

    public static LengthUnitsNetworkEntity[] values() {
        return (LengthUnitsNetworkEntity[]) x.clone();
    }
}
