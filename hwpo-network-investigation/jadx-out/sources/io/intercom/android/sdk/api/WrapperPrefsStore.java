package io.intercom.android.sdk.api;

import android.content.Context;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.a0;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.e22;
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
import defpackage.v72;
import defpackage.v78;
import defpackage.ws0;
import defpackage.x27;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.ze2;
import io.ably.lib.transport.Defaults;
import io.intercom.android.sdk.logger.LumberMill;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class WrapperPrefsStore {
    private static final String OLD_PREFS_NAME = "intercomsdk_wrapper_prefs";
    private static final Twig twig;
    private volatile String cachedCordovaVersion;
    private volatile String cachedReactNativeVersion;
    private final pf2<t78> dataStore;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String OLD_CORDOVA_VERSION_KEY = "cordova_version";
    private static final t78.a<String> KEY_CORDOVA_VERSION = new t78.a<>(OLD_CORDOVA_VERSION_KEY);
    private static final String OLD_REACT_NATIVE_VERSION_KEY = "react_native_version";
    private static final t78.a<String> KEY_REACT_NATIVE_VERSION = new t78.a<>(OLD_REACT_NATIVE_VERSION_KEY);
    private static final fi8<Context, pf2<t78>> wrapperPrefsDataStore$delegate = s7.c("intercom_wrapper_prefs_datastore", null, new e22(1), 10);

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.WrapperPrefsStore$clear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.WrapperPrefsStore$clear$1", f = "WrapperPrefsStore.kt", l = {82}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super t78>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.api.WrapperPrefsStore$clear$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.api.WrapperPrefsStore$clear$1$1", f = "WrapperPrefsStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01171 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C01171(r02<? super C01171> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01171 c01171 = new C01171(r02Var);
                c01171.L$0 = obj;
                return c01171;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01171) create(x27Var, r02Var)).invokeSuspend(g2b.a);
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
            return WrapperPrefsStore.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super t78> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            pf2 pf2Var = WrapperPrefsStore.this.dataStore;
            C01171 c01171 = new C01171(null);
            this.label = 1;
            Object objA = v78.a(pf2Var, c01171, this);
            v72 v72Var = v72.t;
            return objA == v72Var ? v72Var : objA;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.WrapperPrefsStore$getCordovaVersion$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.WrapperPrefsStore$getCordovaVersion$2", f = "WrapperPrefsStore.kt", l = {42}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super String>, Object> {
        int label;

        public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return WrapperPrefsStore.this.new AnonymousClass2(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super String> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = WrapperPrefsStore.this.dataStore.getData();
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
            String str = (String) ((t78) obj).b(WrapperPrefsStore.KEY_CORDOVA_VERSION);
            return str == null ? BuildConfig.FLAVOR : str;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.WrapperPrefsStore$getReactNativeVersion$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.WrapperPrefsStore$getReactNativeVersion$2", f = "WrapperPrefsStore.kt", l = {54}, m = "invokeSuspend")
    public static final class C03092 extends p6a implements ci4<t72, r02<? super String>, Object> {
        int label;

        public C03092(r02<? super C03092> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return WrapperPrefsStore.this.new C03092(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super String> r02Var) {
            return ((C03092) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = WrapperPrefsStore.this.dataStore.getData();
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
            String str = (String) ((t78) obj).b(WrapperPrefsStore.KEY_REACT_NATIVE_VERSION);
            return str == null ? BuildConfig.FLAVOR : str;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.WrapperPrefsStore$setCordovaVersion$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.WrapperPrefsStore$setCordovaVersion$1", f = "WrapperPrefsStore.kt", l = {Defaults.HTTP_ASYNC_THREADPOOL_SIZE}, m = "invokeSuspend")
    public static final class C03101 extends p6a implements ci4<t72, r02<? super t78>, Object> {
        final /* synthetic */ String $version;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.api.WrapperPrefsStore$setCordovaVersion$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.api.WrapperPrefsStore$setCordovaVersion$1$1", f = "WrapperPrefsStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01181 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ String $version;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01181(String str, r02<? super C01181> r02Var) {
                super(2, r02Var);
                this.$version = str;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01181 c01181 = new C01181(this.$version, r02Var);
                c01181.L$0 = obj;
                return c01181;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01181) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ((x27) this.L$0).g(WrapperPrefsStore.KEY_CORDOVA_VERSION, this.$version);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03101(String str, r02<? super C03101> r02Var) {
            super(2, r02Var);
            this.$version = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return WrapperPrefsStore.this.new C03101(this.$version, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super t78> r02Var) {
            return ((C03101) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            pf2 pf2Var = WrapperPrefsStore.this.dataStore;
            C01181 c01181 = new C01181(this.$version, null);
            this.label = 1;
            Object objA = v78.a(pf2Var, c01181, this);
            v72 v72Var = v72.t;
            return objA == v72Var ? v72Var : objA;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.WrapperPrefsStore$setReactNativeVersion$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.api.WrapperPrefsStore$setReactNativeVersion$1", f = "WrapperPrefsStore.kt", l = {73}, m = "invokeSuspend")
    public static final class C03111 extends p6a implements ci4<t72, r02<? super t78>, Object> {
        final /* synthetic */ String $version;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.api.WrapperPrefsStore$setReactNativeVersion$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.api.WrapperPrefsStore$setReactNativeVersion$1$1", f = "WrapperPrefsStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01191 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ String $version;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01191(String str, r02<? super C01191> r02Var) {
                super(2, r02Var);
                this.$version = str;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01191 c01191 = new C01191(this.$version, r02Var);
                c01191.L$0 = obj;
                return c01191;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01191) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ((x27) this.L$0).g(WrapperPrefsStore.KEY_REACT_NATIVE_VERSION, this.$version);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03111(String str, r02<? super C03111> r02Var) {
            super(2, r02Var);
            this.$version = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return WrapperPrefsStore.this.new C03111(this.$version, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super t78> r02Var) {
            return ((C03111) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            pf2 pf2Var = WrapperPrefsStore.this.dataStore;
            C01191 c01191 = new C01191(this.$version, null);
            this.label = 1;
            Object objA = v78.a(pf2Var, c01191, this);
            v72 v72Var = v72.t;
            return objA == v72Var ? v72Var : objA;
        }
    }

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
    }

    private WrapperPrefsStore(pf2<t78> pf2Var) {
        this.dataStore = pf2Var;
    }

    public static final WrapperPrefsStore create(Context context) {
        return Companion.create(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List wrapperPrefsDataStore_delegate$lambda$4(Context context) {
        context.getClass();
        return ws0.h(Companion.createSharedPrefsMigration$intercom_sdk_base_release(context));
    }

    public final void clear() {
        oy0.e(new AnonymousClass1(null));
        this.cachedCordovaVersion = BuildConfig.FLAVOR;
        this.cachedReactNativeVersion = BuildConfig.FLAVOR;
    }

    public final String getCordovaVersion() throws Throwable {
        String str = this.cachedCordovaVersion;
        if (str != null) {
            return str;
        }
        try {
            Object objF = oy0.f(ff3.t, new AnonymousClass2(null));
            this.cachedCordovaVersion = (String) objF;
            return (String) objF;
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to read cordova version from DataStore: ")), new Object[0]);
            return BuildConfig.FLAVOR;
        }
    }

    public final String getReactNativeVersion() throws Throwable {
        String str = this.cachedReactNativeVersion;
        if (str != null) {
            return str;
        }
        try {
            Object objF = oy0.f(ff3.t, new C03092(null));
            this.cachedReactNativeVersion = (String) objF;
            return (String) objF;
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to read react native version from DataStore: ")), new Object[0]);
            return BuildConfig.FLAVOR;
        }
    }

    public final void setCordovaVersion(String str) {
        str.getClass();
        oy0.e(new C03101(str, null));
        this.cachedCordovaVersion = str;
    }

    public final void setReactNativeVersion(String str) {
        str.getClass();
        oy0.e(new C03111(str, null));
        this.cachedReactNativeVersion = str;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        static final /* synthetic */ ho5<Object>[] $$delegatedProperties;

        static {
            oe8 oe8Var = new oe8(Companion.class, "wrapperPrefsDataStore", "getWrapperPrefsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
            ll8.a.getClass();
            $$delegatedProperties = new ho5[]{oe8Var};
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private final pf2<t78> getWrapperPrefsDataStore(Context context) {
            return (pf2) WrapperPrefsStore.wrapperPrefsDataStore$delegate.a(context, $$delegatedProperties[0]);
        }

        public final WrapperPrefsStore create(Context context) {
            context.getClass();
            return new WrapperPrefsStore(getWrapperPrefsDataStore(context), null);
        }

        public final WrapperPrefsStore createForTesting$intercom_sdk_base_release(pf2<t78> pf2Var) {
            pf2Var.getClass();
            return new WrapperPrefsStore(pf2Var, null);
        }

        public final ze2<t78> createSharedPrefsMigration$intercom_sdk_base_release(Context context) {
            context.getClass();
            return new WrapperPrefsStore$Companion$createSharedPrefsMigration$1(context);
        }

        private Companion() {
        }
    }

    public /* synthetic */ WrapperPrefsStore(pf2 pf2Var, qq2 qq2Var) {
        this(pf2Var);
    }
}
