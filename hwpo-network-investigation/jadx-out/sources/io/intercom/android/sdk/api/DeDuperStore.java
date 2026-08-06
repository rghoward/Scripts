package io.intercom.android.sdk.api;

import android.content.Context;
import com.intercom.twig.Twig;
import defpackage.a0;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.ff3;
import defpackage.fi8;
import defpackage.g2b;
import defpackage.ho5;
import defpackage.ll8;
import defpackage.oe8;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.pf2;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import defpackage.s7;
import defpackage.t72;
import defpackage.t78;
import defpackage.tm2;
import defpackage.v2a;
import defpackage.v72;
import defpackage.v78;
import defpackage.ws0;
import defpackage.x27;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.ze2;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.survey.SurveyViewModel;
import io.intercom.android.sdk.utilities.CryptoHelper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeDuperStore {
    private static final String EMPTY_JSON = "{}";
    private static final String OLD_CACHED_ATTRIBUTES_KEY = "CachedAttributes";
    private static final String OLD_EARLIEST_UPDATE_AT_KEY = "EarliestUpdateAt";
    private static final String OLD_PREFS_NAME = "INTERCOM_DEDUPER_PREFS";
    private static final Twig twig;
    private final pf2<t78> dataStore;
    private final t72 scope;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final t78.a<String> KEY_CACHED_ATTRIBUTES = new t78.a<>("cached_attributes");
    private static final t78.a<String> KEY_EARLIEST_UPDATE_AT = new t78.a<>("earliest_update_at");
    private static final fi8<Context, pf2<t78>> deDuperDataStore$delegate = s7.c("intercom_deduper_datastore", null, new tm2(0), 10);

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.DeDuperStore$clear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.DeDuperStore$clear$1", f = "DeDuperStore.kt", l = {SurveyViewModel.ENTITY_TYPE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.api.DeDuperStore$clear$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.api.DeDuperStore$clear$1$1", f = "DeDuperStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01131 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C01131(r02<? super C01131> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01131 c01131 = new C01131(r02Var);
                c01131.L$0 = obj;
                return c01131;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01131) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ((x27) this.L$0).f();
                return g2b.a;
            }
        }

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return DeDuperStore.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = DeDuperStore.this.dataStore;
                C01131 c01131 = new C01131(null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01131, this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.DeDuperStore$getCachedAttributes$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.DeDuperStore$getCachedAttributes$1", f = "DeDuperStore.kt", l = {42}, m = "invokeSuspend")
    public static final class C03021 extends p6a implements ci4<t72, r02<? super String>, Object> {
        int label;

        public C03021(r02<? super C03021> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return DeDuperStore.this.new C03021(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super String> r02Var) {
            return ((C03021) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = DeDuperStore.this.dataStore.getData();
                this.label = 1;
                obj = yk2.k(data, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            String str = (String) ((t78) obj).b(DeDuperStore.KEY_CACHED_ATTRIBUTES);
            if (str != null) {
                String strDecrypt$intercom_sdk_base_release = CryptoHelper.INSTANCE.decrypt$intercom_sdk_base_release(str);
                if (strDecrypt$intercom_sdk_base_release.length() != 0) {
                    return strDecrypt$intercom_sdk_base_release;
                }
            }
            return DeDuperStore.EMPTY_JSON;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.DeDuperStore$getEarliestUpdateAt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.DeDuperStore$getEarliestUpdateAt$1", f = "DeDuperStore.kt", l = {57}, m = "invokeSuspend")
    public static final class C03031 extends p6a implements ci4<t72, r02<? super Long>, Object> {
        int label;

        public C03031(r02<? super C03031> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return DeDuperStore.this.new C03031(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super Long> r02Var) {
            return ((C03031) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = DeDuperStore.this.dataStore.getData();
                this.label = 1;
                obj = yk2.k(data, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            String str = (String) ((t78) obj).b(DeDuperStore.KEY_EARLIEST_UPDATE_AT);
            if (str == null) {
                return new Long(0L);
            }
            Long lG = v2a.g(CryptoHelper.INSTANCE.decrypt$intercom_sdk_base_release(str));
            return new Long(lG != null ? lG.longValue() : 0L);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.DeDuperStore$save$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.DeDuperStore$save$1", f = "DeDuperStore.kt", l = {73}, m = "invokeSuspend")
    public static final class C03041 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ String $cachedAttributesJson;
        final /* synthetic */ long $earliestUpdateAt;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.api.DeDuperStore$save$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.api.DeDuperStore$save$1$1", f = "DeDuperStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01141 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ String $cachedAttributesJson;
            final /* synthetic */ long $earliestUpdateAt;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01141(String str, long j, r02<? super C01141> r02Var) {
                super(2, r02Var);
                this.$cachedAttributesJson = str;
                this.$earliestUpdateAt = j;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01141 c01141 = new C01141(this.$cachedAttributesJson, this.$earliestUpdateAt, r02Var);
                c01141.L$0 = obj;
                return c01141;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01141) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                x27 x27Var = (x27) this.L$0;
                t78.a aVar = DeDuperStore.KEY_CACHED_ATTRIBUTES;
                CryptoHelper cryptoHelper = CryptoHelper.INSTANCE;
                x27Var.g(aVar, cryptoHelper.encrypt$intercom_sdk_base_release(this.$cachedAttributesJson));
                x27Var.g(DeDuperStore.KEY_EARLIEST_UPDATE_AT, cryptoHelper.encrypt$intercom_sdk_base_release(String.valueOf(this.$earliestUpdateAt)));
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03041(String str, long j, r02<? super C03041> r02Var) {
            super(2, r02Var);
            this.$cachedAttributesJson = str;
            this.$earliestUpdateAt = j;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return DeDuperStore.this.new C03041(this.$cachedAttributesJson, this.$earliestUpdateAt, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03041) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = DeDuperStore.this.dataStore;
                C01141 c01141 = new C01141(this.$cachedAttributesJson, this.$earliestUpdateAt, null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01141, this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
    }

    private DeDuperStore(pf2<t78> pf2Var, t72 t72Var) {
        this.dataStore = pf2Var;
        this.scope = t72Var;
    }

    public static final DeDuperStore create(Context context, t72 t72Var) {
        return Companion.create(context, t72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List deDuperDataStore_delegate$lambda$0(Context context) {
        context.getClass();
        return ws0.h(Companion.createSharedPrefsMigration$intercom_sdk_base_release(context));
    }

    public final void clear() {
        oy0.d(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    public final String getCachedAttributes() {
        try {
            return (String) oy0.f(ff3.t, new C03021(null));
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to read cached attributes from DataStore: ")), new Object[0]);
            return EMPTY_JSON;
        }
    }

    public final long getEarliestUpdateAt() {
        try {
            return ((Number) oy0.f(ff3.t, new C03031(null))).longValue();
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to read earliest update at from DataStore: ")), new Object[0]);
            return 0L;
        }
    }

    public final void save(String str, long j) {
        str.getClass();
        oy0.d(this.scope, null, null, new C03041(str, j, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        static final /* synthetic */ ho5<Object>[] $$delegatedProperties;

        static {
            oe8 oe8Var = new oe8(Companion.class, "deDuperDataStore", "getDeDuperDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
            ll8.a.getClass();
            $$delegatedProperties = new ho5[]{oe8Var};
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private final pf2<t78> getDeDuperDataStore(Context context) {
            return (pf2) DeDuperStore.deDuperDataStore$delegate.a(context, $$delegatedProperties[0]);
        }

        public final DeDuperStore create(Context context, t72 t72Var) {
            context.getClass();
            t72Var.getClass();
            return new DeDuperStore(getDeDuperDataStore(context), t72Var, null);
        }

        public final DeDuperStore createForTesting$intercom_sdk_base_release(pf2<t78> pf2Var, t72 t72Var) {
            pf2Var.getClass();
            t72Var.getClass();
            return new DeDuperStore(pf2Var, t72Var, null);
        }

        public final ze2<t78> createSharedPrefsMigration$intercom_sdk_base_release(Context context) {
            context.getClass();
            return new DeDuperStore$Companion$createSharedPrefsMigration$1(context);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeDuperStore(pf2 pf2Var, t72 t72Var, qq2 qq2Var) {
        this(pf2Var, t72Var);
    }
}
