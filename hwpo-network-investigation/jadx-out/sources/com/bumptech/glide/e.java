package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import defpackage.a13;
import defpackage.cq0;
import defpackage.cx3;
import defpackage.dg8;
import defpackage.dm4;
import defpackage.do3;
import defpackage.dx3;
import defpackage.e5b;
import defpackage.eq0;
import defpackage.ex3;
import defpackage.f5b;
import defpackage.fq0;
import defpackage.gq0;
import defpackage.gu8;
import defpackage.h2b;
import defpackage.hq0;
import defpackage.i2b;
import defpackage.j2a;
import defpackage.j2b;
import defpackage.k73;
import defpackage.lt8;
import defpackage.lw3;
import defpackage.lx6;
import defpackage.n1a;
import defpackage.o1a;
import defpackage.o30;
import defpackage.oz0;
import defpackage.pt8;
import defpackage.q1a;
import defpackage.qq0;
import defpackage.reb;
import defpackage.rt8;
import defpackage.rz0;
import defpackage.sl8;
import defpackage.sq6;
import defpackage.sz0;
import defpackage.t45;
import defpackage.tg2;
import defpackage.tm4;
import defpackage.tq6;
import defpackage.tr2;
import defpackage.tz0;
import defpackage.u00;
import defpackage.ud5;
import defpackage.v00;
import defpackage.v40;
import defpackage.vq6;
import defpackage.vz0;
import defpackage.w43;
import defpackage.w75;
import defpackage.wl4;
import defpackage.wm4;
import defpackage.wu;
import defpackage.wz0;
import defpackage.xl4;
import defpackage.xz0;
import defpackage.yl4;
import defpackage.yt8;
import defpackage.z4b;
import defpackage.zs7;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static sl8 a(a aVar, List<tm4> list, v00 v00Var) {
        pt8 rz0Var;
        pt8 n1aVar;
        Class cls;
        qq0 qq0Var = aVar.t;
        o30 o30Var = aVar.w;
        c cVar = aVar.v;
        Context applicationContext = cVar.getApplicationContext();
        d dVar = cVar.h;
        sl8 sl8Var = new sl8();
        tr2 tr2Var = new tr2();
        w75 w75Var = sl8Var.g;
        synchronized (w75Var) {
            w75Var.a.add(tr2Var);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            do3 do3Var = new do3();
            w75 w75Var2 = sl8Var.g;
            synchronized (w75Var2) {
                w75Var2.a.add(do3Var);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = sl8Var.e();
        wz0 wz0Var = new wz0(applicationContext, arrayListE, qq0Var, o30Var);
        pt8 rebVar = new reb(qq0Var, new reb.g());
        w43 w43Var = new w43(sl8Var.e(), resources.getDisplayMetrics(), qq0Var, o30Var);
        if (i < 28 || !dVar.a.containsKey(b.C0046b.class)) {
            rz0Var = new rz0(w43Var);
            n1aVar = new n1a(w43Var, o30Var);
        } else {
            n1aVar = new ud5();
            rz0Var = new sz0();
        }
        if (i >= 28) {
            sl8Var.d("Animation", InputStream.class, Drawable.class, new wu.c(new wu(arrayListE, o30Var)));
            sl8Var.d("Animation", ByteBuffer.class, Drawable.class, new wu.b(new wu(arrayListE, o30Var)));
        }
        rt8 rt8Var = new rt8(applicationContext);
        hq0 hq0Var = new hq0(o30Var);
        cq0 cq0Var = new cq0();
        u00 u00Var = new u00();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        sl8Var.a(ByteBuffer.class, new tz0());
        sl8Var.a(InputStream.class, new o1a(o30Var));
        sl8Var.d("Bitmap", ByteBuffer.class, Bitmap.class, rz0Var);
        sl8Var.d("Bitmap", InputStream.class, Bitmap.class, n1aVar);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            pt8 zs7Var = new zs7(w43Var);
            cls = ParcelFileDescriptor.class;
            sl8Var.d("Bitmap", cls, Bitmap.class, zs7Var);
        }
        sl8Var.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new reb(qq0Var, new reb.c()));
        sl8Var.d("Bitmap", cls, Bitmap.class, rebVar);
        lx6 lx6Var = j2b.a.a;
        sl8Var.c(Bitmap.class, Bitmap.class, lx6Var);
        sl8Var.d("Bitmap", Bitmap.class, Bitmap.class, new h2b());
        sl8Var.b(Bitmap.class, hq0Var);
        sl8Var.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new eq0(resources, rz0Var));
        sl8Var.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new eq0(resources, n1aVar));
        sl8Var.d("BitmapDrawable", cls, BitmapDrawable.class, new eq0(resources, rebVar));
        sl8Var.b(BitmapDrawable.class, new fq0(qq0Var, hq0Var));
        sl8Var.d("Animation", InputStream.class, xl4.class, new q1a(arrayListE, wz0Var, o30Var));
        sl8Var.d("Animation", ByteBuffer.class, xl4.class, wz0Var);
        sl8Var.b(xl4.class, new yl4());
        sl8Var.c(wl4.class, wl4.class, lx6Var);
        sl8Var.d("Bitmap", wl4.class, Bitmap.class, new dm4(qq0Var));
        sl8Var.d("legacy_append", Uri.class, Drawable.class, rt8Var);
        sl8Var.d("legacy_append", Uri.class, Bitmap.class, new lt8(rt8Var, qq0Var));
        sl8Var.h(new xz0.a());
        sl8Var.c(File.class, ByteBuffer.class, new vz0.b());
        sl8Var.c(File.class, InputStream.class, new cx3.e(new ex3()));
        sl8Var.d("legacy_append", File.class, File.class, new lw3());
        sl8Var.c(File.class, cls, new cx3.b(new dx3()));
        sl8Var.c(File.class, File.class, lx6Var);
        sl8Var.h(new com.bumptech.glide.load.data.c.a(o30Var));
        if (!"robolectric".equals(str)) {
            sl8Var.h(new ParcelFileDescriptorRewinder.a());
        }
        lx6 cVar2 = new a13.c(applicationContext);
        lx6 aVar2 = new a13.a(applicationContext);
        lx6 bVar = new a13.b(applicationContext);
        Class cls2 = Integer.TYPE;
        sl8Var.c(cls2, InputStream.class, cVar2);
        sl8Var.c(Integer.class, InputStream.class, cVar2);
        sl8Var.c(cls2, AssetFileDescriptor.class, aVar2);
        sl8Var.c(Integer.class, AssetFileDescriptor.class, aVar2);
        sl8Var.c(cls2, Drawable.class, bVar);
        sl8Var.c(Integer.class, Drawable.class, bVar);
        sl8Var.c(Uri.class, InputStream.class, new gu8.b(applicationContext));
        sl8Var.c(Uri.class, AssetFileDescriptor.class, new gu8.a(applicationContext));
        lx6 cVar3 = new yt8.c(resources);
        lx6 aVar3 = new yt8.a(resources);
        lx6 bVar2 = new yt8.b(resources);
        sl8Var.c(Integer.class, Uri.class, cVar3);
        sl8Var.c(cls2, Uri.class, cVar3);
        sl8Var.c(Integer.class, AssetFileDescriptor.class, aVar3);
        sl8Var.c(cls2, AssetFileDescriptor.class, aVar3);
        sl8Var.c(Integer.class, InputStream.class, bVar2);
        sl8Var.c(cls2, InputStream.class, bVar2);
        sl8Var.c(String.class, InputStream.class, new tg2.b());
        sl8Var.c(Uri.class, InputStream.class, new tg2.b());
        sl8Var.c(String.class, InputStream.class, new j2a.c());
        sl8Var.c(String.class, cls, new j2a.b());
        sl8Var.c(String.class, AssetFileDescriptor.class, new j2a.a());
        sl8Var.c(Uri.class, InputStream.class, new v40.c(applicationContext.getAssets()));
        sl8Var.c(Uri.class, AssetFileDescriptor.class, new v40.b(applicationContext.getAssets()));
        sl8Var.c(Uri.class, InputStream.class, new tq6.a(applicationContext));
        sl8Var.c(Uri.class, InputStream.class, new vq6.a(applicationContext));
        if (i >= 29) {
            sl8Var.c(Uri.class, InputStream.class, new dg8.c(applicationContext, InputStream.class));
            sl8Var.c(Uri.class, cls, new dg8.b(applicationContext, cls));
        }
        boolean zContainsKey = dVar.a.containsKey(b.f.class);
        sl8Var.c(Uri.class, InputStream.class, new z4b.d(contentResolver, zContainsKey));
        sl8Var.c(Uri.class, cls, new z4b.b(contentResolver, zContainsKey));
        sl8Var.c(Uri.class, AssetFileDescriptor.class, new z4b.a(contentResolver, zContainsKey));
        sl8Var.c(Uri.class, InputStream.class, new f5b.a());
        sl8Var.c(URL.class, InputStream.class, new e5b.a());
        sl8Var.c(Uri.class, File.class, new sq6.a(applicationContext));
        sl8Var.c(wm4.class, InputStream.class, new t45.a());
        sl8Var.c(byte[].class, ByteBuffer.class, new oz0.a());
        sl8Var.c(byte[].class, InputStream.class, new oz0.d());
        sl8Var.c(Uri.class, Uri.class, lx6Var);
        sl8Var.c(Drawable.class, Drawable.class, lx6Var);
        sl8Var.d("legacy_append", Drawable.class, Drawable.class, new i2b());
        sl8Var.i(Bitmap.class, BitmapDrawable.class, new gq0(resources));
        sl8Var.i(Bitmap.class, byte[].class, cq0Var);
        sl8Var.i(Drawable.class, byte[].class, new k73(qq0Var, cq0Var, u00Var));
        sl8Var.i(xl4.class, byte[].class, u00Var);
        pt8 rebVar2 = new reb(qq0Var, new reb.d());
        sl8Var.d("legacy_append", ByteBuffer.class, Bitmap.class, rebVar2);
        sl8Var.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new eq0(resources, rebVar2));
        for (tm4 tm4Var : list) {
            try {
                tm4Var.b(applicationContext, aVar, sl8Var);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(tm4Var.getClass().getName()), e);
            }
        }
        if (v00Var != null) {
            v00Var.a(applicationContext, aVar, sl8Var);
        }
        return sl8Var;
    }
}
