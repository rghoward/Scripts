package defpackage;

import com.hwpo_training_app.hwpo_library.data.response.AttachmentsListResponse;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g70 implements f70 {
    public final c70 a;
    public volatile int b = 1;
    public volatile int c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sn6.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public g70(c70 c70Var) {
        this.a = c70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.f70
    public final Serializable a(sn6 sn6Var, int i, u02 u02Var) throws Throwable {
        i70 i70Var;
        if (u02Var instanceof i70) {
            i70Var = (i70) u02Var;
            int i2 = i70Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i70Var.v = i2 - Integer.MIN_VALUE;
            } else {
                i70Var = new i70(this, u02Var);
            }
        } else {
            i70Var = new i70(this, u02Var);
        }
        Object objC = i70Var.t;
        v72 v72Var = v72.t;
        int i3 = i70Var.v;
        if (i3 == 0) {
            dv8.b(objC);
            this.b++;
            if (this.b >= this.c) {
                return hf3.t;
            }
            int i4 = this.b;
            i70Var.v = 1;
            objC = c(sn6Var, i4, i, i70Var);
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objC);
        }
        AttachmentsListResponse attachmentsListResponse = (AttachmentsListResponse) objC;
        this.c = attachmentsListResponse.b.b;
        return (Serializable) g93.a(attachmentsListResponse.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.f70
    public final Serializable b(sn6 sn6Var, int i, u02 u02Var) throws Throwable {
        h70 h70Var;
        if (u02Var instanceof h70) {
            h70Var = (h70) u02Var;
            int i2 = h70Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h70Var.v = i2 - Integer.MIN_VALUE;
            } else {
                h70Var = new h70(this, u02Var);
            }
        } else {
            h70Var = new h70(this, u02Var);
        }
        Object objC = h70Var.t;
        v72 v72Var = v72.t;
        int i3 = h70Var.v;
        if (i3 == 0) {
            dv8.b(objC);
            this.b = 1;
            int i4 = this.b;
            h70Var.v = 1;
            objC = c(sn6Var, i4, i, h70Var);
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objC);
        }
        AttachmentsListResponse attachmentsListResponse = (AttachmentsListResponse) objC;
        this.c = attachmentsListResponse.b.b;
        return (Serializable) g93.a(attachmentsListResponse.a);
    }

    public final Object c(sn6 sn6Var, int i, int i2, u02 u02Var) {
        int i3 = sn6Var == null ? -1 : a.a[sn6Var.ordinal()];
        String str = null;
        if (i3 != -1) {
            if (i3 == 1) {
                str = AppearanceType.IMAGE;
            } else if (i3 == 2) {
                str = "video";
            } else if (i3 == 3) {
                str = "youtube";
            } else {
                if (i3 != 4) {
                    u.b();
                    return null;
                }
                str = "other";
            }
        }
        return this.a.a(new Integer(i), new Integer(i2), str, u02Var);
    }
}
