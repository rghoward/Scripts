package io.intercom.android.sdk.identity;

import android.content.Context;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.a0;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.ff3;
import defpackage.fi8;
import defpackage.g2b;
import defpackage.ho5;
import defpackage.js7;
import defpackage.ll8;
import defpackage.oe8;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.pf2;
import defpackage.po9;
import defpackage.qi6;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import defpackage.ru3;
import defpackage.s7;
import defpackage.t72;
import defpackage.t78;
import defpackage.v72;
import defpackage.v78;
import defpackage.ws0;
import defpackage.wu0;
import defpackage.x27;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.ze2;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.CryptoHelper;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UserIdentityStore {
    private static final t78.a<String> KEY_ANONYMOUS_ID;
    private static final t78.a<String> KEY_EMAIL;
    private static final t78.a<String> KEY_HMAC;
    private static final t78.a<String> KEY_INTERCOM_ID;
    private static final t78.a<String> KEY_JWT;
    private static final t78.a<String> KEY_USER_ID;
    private static final Map<String, t78.a<String>> MIGRATION_KEY_MAP;
    private static final String OLD_KEY_PREFIX = "intercomsdk-session-";
    private static final String OLD_PREFS_NAME = "INTERCOM_SDK_USER_PREFS";
    private static final fi8<Context, pf2<t78>> userDataStore$delegate;
    private final pf2<t78> dataStore;
    private final t72 scope;
    private final Twig twig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.UserIdentityStore$clear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.UserIdentityStore$clear$1", f = "UserIdentityStore.kt", l = {92}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.UserIdentityStore$clear$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.UserIdentityStore$clear$1$1", f = "UserIdentityStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01391 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C01391(r02<? super C01391> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01391 c01391 = new C01391(r02Var);
                c01391.L$0 = obj;
                return c01391;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01391) create(x27Var, r02Var)).invokeSuspend(g2b.a);
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
            return UserIdentityStore.this.new AnonymousClass1(r02Var);
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
                pf2 pf2Var = UserIdentityStore.this.dataStore;
                C01391 c01391 = new C01391(null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01391, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.UserIdentityStore$loadUserFields$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.UserIdentityStore$loadUserFields$1", f = "UserIdentityStore.kt", l = {50}, m = "invokeSuspend")
    public static final class C03341 extends p6a implements ci4<t72, r02<? super UserFields>, Object> {
        int label;

        public C03341(r02<? super C03341> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return UserIdentityStore.this.new C03341(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super UserFields> r02Var) {
            return ((C03341) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 data = UserIdentityStore.this.dataStore.getData();
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
            t78 t78Var = (t78) obj;
            return new UserFields(UserIdentityStore.this.decryptField(t78Var, UserIdentityStore.KEY_ANONYMOUS_ID), UserIdentityStore.this.decryptField(t78Var, UserIdentityStore.KEY_INTERCOM_ID), UserIdentityStore.this.decryptField(t78Var, UserIdentityStore.KEY_USER_ID), UserIdentityStore.this.decryptField(t78Var, UserIdentityStore.KEY_EMAIL), UserIdentityStore.this.decryptField(t78Var, UserIdentityStore.KEY_HMAC), UserIdentityStore.this.decryptField(t78Var, UserIdentityStore.KEY_JWT));
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.identity.UserIdentityStore$save$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.identity.UserIdentityStore$save$1", f = "UserIdentityStore.kt", l = {79}, m = "invokeSuspend")
    public static final class C03351 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ UserFields $fields;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.identity.UserIdentityStore$save$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.identity.UserIdentityStore$save$1$1", f = "UserIdentityStore.kt", l = {}, m = "invokeSuspend")
        public static final class C01401 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
            final /* synthetic */ UserFields $fields;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01401(UserFields userFields, r02<? super C01401> r02Var) {
                super(2, r02Var);
                this.$fields = userFields;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01401 c01401 = new C01401(this.$fields, r02Var);
                c01401.L$0 = obj;
                return c01401;
            }

            @Override // defpackage.ci4
            public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
                return ((C01401) create(x27Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                x27 x27Var = (x27) this.L$0;
                t78.a aVar = UserIdentityStore.KEY_ANONYMOUS_ID;
                CryptoHelper cryptoHelper = CryptoHelper.INSTANCE;
                x27Var.g(aVar, cryptoHelper.encrypt$intercom_sdk_base_release(this.$fields.getAnonymousId()));
                x27Var.g(UserIdentityStore.KEY_INTERCOM_ID, cryptoHelper.encrypt$intercom_sdk_base_release(this.$fields.getIntercomId()));
                x27Var.g(UserIdentityStore.KEY_USER_ID, cryptoHelper.encrypt$intercom_sdk_base_release(this.$fields.getUserId()));
                x27Var.g(UserIdentityStore.KEY_EMAIL, cryptoHelper.encrypt$intercom_sdk_base_release(this.$fields.getEmail()));
                x27Var.g(UserIdentityStore.KEY_HMAC, cryptoHelper.encrypt$intercom_sdk_base_release(this.$fields.getHmac()));
                x27Var.g(UserIdentityStore.KEY_JWT, cryptoHelper.encrypt$intercom_sdk_base_release(this.$fields.getJwt()));
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03351(UserFields userFields, r02<? super C03351> r02Var) {
            super(2, r02Var);
            this.$fields = userFields;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return UserIdentityStore.this.new C03351(this.$fields, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03351) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                pf2 pf2Var = UserIdentityStore.this.dataStore;
                C01401 c01401 = new C01401(this.$fields, null);
                this.label = 1;
                Object objA = v78.a(pf2Var, c01401, this);
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
        t78.a<String> aVar = new t78.a<>(UserIdentity.ANONYMOUS_ID);
        KEY_ANONYMOUS_ID = aVar;
        t78.a<String> aVar2 = new t78.a<>(UserIdentity.INTERCOM_ID);
        KEY_INTERCOM_ID = aVar2;
        t78.a<String> aVar3 = new t78.a<>("user_id");
        KEY_USER_ID = aVar3;
        t78.a<String> aVar4 = new t78.a<>("email");
        KEY_EMAIL = aVar4;
        t78.a<String> aVar5 = new t78.a<>("hmac");
        KEY_HMAC = aVar5;
        t78.a<String> aVar6 = new t78.a<>("jwt");
        KEY_JWT = aVar6;
        MIGRATION_KEY_MAP = qi6.i(new js7("INTERCOM_SDK_ANONYMOUS_ID", aVar), new js7("INTERCOM_SDK_INTERCOM_ID", aVar2), new js7("INTERCOM_SDK_USER_ID", aVar3), new js7("INTERCOM_SDK_EMAIL_ID", aVar4), new js7("SecureMode_HMAC", aVar5), new js7("INTERCOM_SDK_JWT", aVar6));
        userDataStore$delegate = s7.c("intercom_user_prefs_datastore", null, new po9(1), 10);
    }

    private UserIdentityStore(pf2<t78> pf2Var, t72 t72Var) {
        this.dataStore = pf2Var;
        this.scope = t72Var;
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        this.twig = logger;
    }

    public static final UserIdentityStore create(Context context, t72 t72Var) {
        return Companion.create(context, t72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String decryptField(t78 t78Var, t78.a<String> aVar) {
        String str = (String) t78Var.b(aVar);
        return str == null ? BuildConfig.FLAVOR : CryptoHelper.INSTANCE.decrypt$intercom_sdk_base_release(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List userDataStore_delegate$lambda$0(Context context) {
        context.getClass();
        return ws0.h(Companion.createSharedPrefsMigration$intercom_sdk_base_release(context));
    }

    public final void clear() {
        oy0.d(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    public final UserFields loadUserFields() {
        try {
            return (UserFields) oy0.f(ff3.t, new C03341(null));
        } catch (Exception e) {
            this.twig.w(a0.a(e, new StringBuilder("Failed to load user fields from DataStore, returning defaults: ")), new Object[0]);
            return new UserFields(null, null, null, null, null, null, 63, null);
        }
    }

    public final void save(UserFields userFields) {
        userFields.getClass();
        oy0.d(this.scope, null, null, new C03351(userFields, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        static final /* synthetic */ ho5<Object>[] $$delegatedProperties;

        static {
            oe8 oe8Var = new oe8(Companion.class, "userDataStore", "getUserDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
            ll8.a.getClass();
            $$delegatedProperties = new ho5[]{oe8Var};
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private final pf2<t78> getUserDataStore(Context context) {
            return (pf2) UserIdentityStore.userDataStore$delegate.a(context, $$delegatedProperties[0]);
        }

        public final UserIdentityStore create(Context context, t72 t72Var) {
            context.getClass();
            t72Var.getClass();
            return new UserIdentityStore(getUserDataStore(context), t72Var, null);
        }

        public final UserIdentityStore createForTesting$intercom_sdk_base_release(pf2<t78> pf2Var, t72 t72Var) {
            pf2Var.getClass();
            t72Var.getClass();
            return new UserIdentityStore(pf2Var, t72Var, null);
        }

        public final ze2<t78> createSharedPrefsMigration$intercom_sdk_base_release(Context context) {
            context.getClass();
            return new UserIdentityStore$Companion$createSharedPrefsMigration$1(context);
        }

        private Companion() {
        }
    }

    public /* synthetic */ UserIdentityStore(pf2 pf2Var, t72 t72Var, qq2 qq2Var) {
        this(pf2Var, t72Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class UserFields {
        public static final int $stable = 0;
        private final String anonymousId;
        private final String email;
        private final String hmac;
        private final String intercomId;
        private final String jwt;
        private final String userId;

        public /* synthetic */ UserFields(String str, String str2, String str3, String str4, String str5, String str6, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? BuildConfig.FLAVOR : str4, (i & 16) != 0 ? BuildConfig.FLAVOR : str5, (i & 32) != 0 ? BuildConfig.FLAVOR : str6);
        }

        public static /* synthetic */ UserFields copy$default(UserFields userFields, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userFields.anonymousId;
            }
            if ((i & 2) != 0) {
                str2 = userFields.intercomId;
            }
            if ((i & 4) != 0) {
                str3 = userFields.userId;
            }
            if ((i & 8) != 0) {
                str4 = userFields.email;
            }
            if ((i & 16) != 0) {
                str5 = userFields.hmac;
            }
            if ((i & 32) != 0) {
                str6 = userFields.jwt;
            }
            String str7 = str5;
            String str8 = str6;
            return userFields.copy(str, str2, str3, str4, str7, str8);
        }

        public final String component1() {
            return this.anonymousId;
        }

        public final String component2() {
            return this.intercomId;
        }

        public final String component3() {
            return this.userId;
        }

        public final String component4() {
            return this.email;
        }

        public final String component5() {
            return this.hmac;
        }

        public final String component6() {
            return this.jwt;
        }

        public final UserFields copy(String str, String str2, String str3, String str4, String str5, String str6) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            str6.getClass();
            return new UserFields(str, str2, str3, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserFields)) {
                return false;
            }
            UserFields userFields = (UserFields) obj;
            return xj5.a(this.anonymousId, userFields.anonymousId) && xj5.a(this.intercomId, userFields.intercomId) && xj5.a(this.userId, userFields.userId) && xj5.a(this.email, userFields.email) && xj5.a(this.hmac, userFields.hmac) && xj5.a(this.jwt, userFields.jwt);
        }

        public final String getAnonymousId() {
            return this.anonymousId;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getHmac() {
            return this.hmac;
        }

        public final String getIntercomId() {
            return this.intercomId;
        }

        public final String getJwt() {
            return this.jwt;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.jwt.hashCode() + ru3.c(ru3.c(ru3.c(ru3.c(this.anonymousId.hashCode() * 31, 31, this.intercomId), 31, this.userId), 31, this.email), 31, this.hmac);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("UserFields(anonymousId=");
            sb.append(this.anonymousId);
            sb.append(", intercomId=");
            sb.append(this.intercomId);
            sb.append(", userId=");
            sb.append(this.userId);
            sb.append(", email=");
            sb.append(this.email);
            sb.append(", hmac=");
            sb.append(this.hmac);
            sb.append(", jwt=");
            return wu0.a(sb, this.jwt, ')');
        }

        public UserFields(String str, String str2, String str3, String str4, String str5, String str6) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            str6.getClass();
            this.anonymousId = str;
            this.intercomId = str2;
            this.userId = str3;
            this.email = str4;
            this.hmac = str5;
            this.jwt = str6;
        }

        public UserFields() {
            this(null, null, null, null, null, null, 63, null);
        }
    }
}
