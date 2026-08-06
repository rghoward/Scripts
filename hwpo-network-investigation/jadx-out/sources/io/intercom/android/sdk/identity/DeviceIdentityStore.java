package io.intercom.android.sdk.identity;

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
import defpackage.v72;
import defpackage.v78;
import defpackage.ws0;
import defpackage.x27;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.ze2;
import defpackage.zy2;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.CryptoHelper;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceIdentityStore {
    private static final t78.a<String> KEY_DEVICE_IDENTIFIER;
    private static final String KEY_NAME = "device_identifier";
    private static final String LEGACY_PREFS_NAME = "INTERCOM_SDK_PREFS";
    private static final fi8<Context, pf2<t78>> deviceDataStore$delegate;
    private static final Twig twig;
    private final String cachedDeviceId;
    private final pf2<t78> dataStore;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.DeviceIdentityStore$loadDeviceIdentifier$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.DeviceIdentityStore$loadDeviceIdentifier$1", f = "DeviceIdentityStore.kt", l = {48, 57}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super String>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.DeviceIdentityStore$loadDeviceIdentifier$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.DeviceIdentityStore$loadDeviceIdentifier$1$1", f = "DeviceIdentityStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01351 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ String $newId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01351(String str, r02<? super C01351> r02Var) {
                super(2, r02Var);
                this.$newId = str;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01351 c01351 = new C01351(this.$newId, r02Var);
                c01351.L$0 = obj;
                return c01351;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01351) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ((x27) this.L$0).g(DeviceIdentityStore.Companion.getKEY_DEVICE_IDENTIFIER$intercom_sdk_base_release(), CryptoHelper.INSTANCE.encrypt$intercom_sdk_base_release(this.$newId));
                return g2b.a;
            }
        }

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return DeviceIdentityStore.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super String> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            v72 v72Var = v72.t;
            if (i == 0) {
                dv8.b(obj);
                r54 data = DeviceIdentityStore.this.dataStore.getData();
                this.label = 1;
                obj = yk2.k(data, this);
                if (obj != v72Var) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str = (String) this.L$0;
                dv8.b(obj);
                return str;
            }
            dv8.b(obj);
            String str2 = (String) ((t78) obj).b(DeviceIdentityStore.Companion.getKEY_DEVICE_IDENTIFIER$intercom_sdk_base_release());
            if (str2 != null) {
                String strDecrypt$intercom_sdk_base_release = CryptoHelper.INSTANCE.decrypt$intercom_sdk_base_release(str2);
                if (strDecrypt$intercom_sdk_base_release.length() > 0) {
                    return strDecrypt$intercom_sdk_base_release;
                }
            }
            String string = UUID.randomUUID().toString();
            string.getClass();
            pf2 pf2Var = DeviceIdentityStore.this.dataStore;
            C01351 c01351 = new C01351(string, null);
            this.L$0 = string;
            this.label = 2;
            return v78.a(pf2Var, c01351, this) == v72Var ? v72Var : string;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.DeviceIdentityStore$loadDeviceIdentifier$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.DeviceIdentityStore$loadDeviceIdentifier$2", f = "DeviceIdentityStore.kt", l = {68}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super t78>, Object> {
        final /* synthetic */ String $fallback;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.DeviceIdentityStore$loadDeviceIdentifier$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.DeviceIdentityStore$loadDeviceIdentifier$2$1", f = "DeviceIdentityStore.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ String $fallback;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, r02<? super AnonymousClass1> r02Var) {
                super(2, r02Var);
                this.$fallback = str;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fallback, r02Var);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((AnonymousClass1) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ((x27) this.L$0).g(DeviceIdentityStore.Companion.getKEY_DEVICE_IDENTIFIER$intercom_sdk_base_release(), CryptoHelper.INSTANCE.encrypt$intercom_sdk_base_release(this.$fallback));
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
            this.$fallback = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return DeviceIdentityStore.this.new AnonymousClass2(this.$fallback, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super t78> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
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
            pf2 pf2Var = DeviceIdentityStore.this.dataStore;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fallback, null);
            this.label = 1;
            Object objA = v78.a(pf2Var, anonymousClass1, this);
            v72 v72Var = v72.t;
            return objA == v72Var ? v72Var : objA;
        }
    }

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
        KEY_DEVICE_IDENTIFIER = new t78.a<>(KEY_NAME);
        deviceDataStore$delegate = s7.c("intercom_device_prefs_datastore", null, new zy2(0), 10);
    }

    private DeviceIdentityStore(pf2<t78> pf2Var) {
        this.dataStore = pf2Var;
        this.cachedDeviceId = loadDeviceIdentifier();
    }

    public static final DeviceIdentityStore create(Context context) {
        return Companion.create(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List deviceDataStore_delegate$lambda$0(Context context) {
        context.getClass();
        return ws0.h(Companion.createSharedPrefsMigration$intercom_sdk_base_release(context));
    }

    private final String loadDeviceIdentifier() {
        try {
            return (String) oy0.f(ff3.t, new AnonymousClass1(null));
        } catch (Exception e) {
            twig.w(a0.a(e, new StringBuilder("Failed to load device identifier from DataStore, generating fallback: ")), new Object[0]);
            String string = UUID.randomUUID().toString();
            string.getClass();
            try {
                oy0.e(new AnonymousClass2(string, null));
            } catch (Exception e2) {
                twig.w(a0.a(e2, new StringBuilder("Failed to persist fallback device identifier: ")), new Object[0]);
            }
            return string;
        }
    }

    public final String getDeviceIdentifier() {
        return this.cachedDeviceId;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        static final /* synthetic */ ho5<Object>[] $$delegatedProperties;

        static {
            oe8 oe8Var = new oe8(Companion.class, "deviceDataStore", "getDeviceDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
            ll8.a.getClass();
            $$delegatedProperties = new ho5[]{oe8Var};
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private final pf2<t78> getDeviceDataStore(Context context) {
            return (pf2) DeviceIdentityStore.deviceDataStore$delegate.a(context, $$delegatedProperties[0]);
        }

        public final DeviceIdentityStore create(Context context) {
            context.getClass();
            return new DeviceIdentityStore(getDeviceDataStore(context), null);
        }

        public final DeviceIdentityStore createForTesting$intercom_sdk_base_release(pf2<t78> pf2Var) {
            pf2Var.getClass();
            return new DeviceIdentityStore(pf2Var, null);
        }

        public final ze2<t78> createSharedPrefsMigration$intercom_sdk_base_release(Context context) {
            context.getClass();
            return new DeviceIdentityStore$Companion$createSharedPrefsMigration$1(context);
        }

        public final t78.a<String> getKEY_DEVICE_IDENTIFIER$intercom_sdk_base_release() {
            return DeviceIdentityStore.KEY_DEVICE_IDENTIFIER;
        }

        private Companion() {
        }

        public static /* synthetic */ void getKEY_DEVICE_IDENTIFIER$intercom_sdk_base_release$annotations() {
        }
    }

    public /* synthetic */ DeviceIdentityStore(pf2 pf2Var, qq2 qq2Var) {
        this(pf2Var);
    }
}
