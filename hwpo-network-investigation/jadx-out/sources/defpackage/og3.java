package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
public final class og3 extends p6a implements ci4<t72, r02<? super f5a>, Object> {
    public final /* synthetic */ ug5.a A;
    public int t;
    public final /* synthetic */ ig3 u;
    public final /* synthetic */ k85 v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ zk7 x;
    public final /* synthetic */ nm3 y;
    public final /* synthetic */ ar6.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og3(ig3 ig3Var, k85 k85Var, Object obj, zk7 zk7Var, nm3 nm3Var, ar6.a aVar, ug5.a aVar2, r02<? super og3> r02Var) {
        super(2, r02Var);
        this.u = ig3Var;
        this.v = k85Var;
        this.w = obj;
        this.x = zk7Var;
        this.y = nm3Var;
        this.z = aVar;
        this.A = aVar2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new og3(this.u, this.v, this.w, this.x, this.y, this.z, this.A, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super f5a> r02Var) {
        return ((og3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        og3 og3Var;
        ar6 ar6VarE;
        Bitmap bitmap;
        boolean z;
        v72 v72Var = v72.t;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            ig3 ig3Var = this.u;
            k85 k85Var = this.v;
            Object obj2 = this.w;
            zk7 zk7Var = this.x;
            nm3 nm3Var = this.y;
            this.t = 1;
            og3Var = this;
            obj = ig3.c(ig3Var, k85Var, obj2, zk7Var, nm3Var, og3Var);
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            og3Var = this;
        }
        ig3.a aVar = (ig3.a) obj;
        x7a x7aVar = og3Var.u.b;
        synchronized (x7aVar) {
            try {
                ti8 ti8Var = x7aVar.t.get();
                if (ti8Var == null) {
                    x7aVar.b();
                } else if (x7aVar.u == null) {
                    Context context = ti8Var.a;
                    x7aVar.u = context;
                    context.registerComponentCallbacks(x7aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        br6 br6Var = og3Var.u.d;
        ar6.a aVar2 = og3Var.z;
        if (!og3Var.v.q.u || (ar6VarE = br6Var.a.e()) == null || aVar2 == null) {
            z = false;
        } else {
            Drawable drawable = aVar.a;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                z = false;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(aVar.b));
                String str = aVar.d;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                ar6VarE.c(aVar2, new ar6.b(bitmap, linkedHashMap));
                z = true;
            }
        }
        Drawable drawable2 = aVar.a;
        k85 k85Var2 = og3Var.v;
        jf2 jf2Var = aVar.c;
        ar6.a aVar3 = z ? og3Var.z : null;
        String str2 = aVar.d;
        boolean z2 = aVar.b;
        ug5.a aVar4 = og3Var.A;
        Bitmap.Config[] configArr = v.a;
        return new f5a(drawable2, k85Var2, jf2Var, aVar3, str2, z2, (aVar4 instanceof bj8) && ((bj8) aVar4).g);
    }
}
