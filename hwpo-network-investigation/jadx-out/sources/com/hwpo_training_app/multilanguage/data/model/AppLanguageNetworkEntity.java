package com.hwpo_training_app.multilanguage.data.model;

import defpackage.f93;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.s10;
import defpackage.ss5;
import defpackage.t10;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public abstract class AppLanguageNetworkEntity implements f93<s10> {
    public static final Companion Companion;
    public static final ss5<KSerializer<Object>> u;
    public static final a v;
    public static final c w;
    public static final b x;
    public static final /* synthetic */ AppLanguageNetworkEntity[] y;
    public final String t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<AppLanguageNetworkEntity> serializer() {
            return (KSerializer) AppLanguageNetworkEntity.u.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends AppLanguageNetworkEntity {
        @Override // defpackage.f93
        public final s10 a() {
            return s10.ENGLISH;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends AppLanguageNetworkEntity {
        @Override // defpackage.f93
        public final s10 a() {
            return s10.ESPANOL;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends AppLanguageNetworkEntity {
        @Override // defpackage.f93
        public final s10 a() {
            return s10.FRANCAIS;
        }
    }

    static {
        a aVar = new a("ENGLISH", 0, "en");
        v = aVar;
        c cVar = new c("FRANCAIS", 1, "fr");
        w = cVar;
        b bVar = new b("ESPANOL", 2, "es");
        x = bVar;
        y = new AppLanguageNetworkEntity[]{aVar, cVar, bVar};
        Companion = new Companion();
        u = hv5.c(j26.t, new t10(0));
    }

    public AppLanguageNetworkEntity() {
        throw null;
    }

    public AppLanguageNetworkEntity(String str, int i, String str2) {
        super(str, i);
        this.t = str2;
    }

    public static AppLanguageNetworkEntity valueOf(String str) {
        return (AppLanguageNetworkEntity) Enum.valueOf(AppLanguageNetworkEntity.class, str);
    }

    public static AppLanguageNetworkEntity[] values() {
        return (AppLanguageNetworkEntity[]) y.clone();
    }
}
