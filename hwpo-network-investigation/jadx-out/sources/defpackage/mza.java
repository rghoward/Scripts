package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mza extends rza {
    public static final Class<?> a;
    public static final Constructor<?> b;
    public static final Method c;
    public static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.rza
    public final Typeface a(Context context, ib4.b bVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (ib4.c cVar : bVar.a) {
                int i2 = cVar.f;
                File fileC = sza.c(context);
                if (fileC != null) {
                    try {
                        if (sza.a(fileC, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileC);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileC.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileC.delete();
                        }
                        if (map != null && f(objNewInstance, map, cVar.e, cVar.b, cVar.c)) {
                        }
                    } catch (Throwable th3) {
                        fileC.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return g(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.rza
    public final Typeface b(Context context, rb4[] rb4VarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            ep9 ep9Var = new ep9();
            for (rb4 rb4Var : rb4VarArr) {
                Uri uri = rb4Var.a;
                ByteBuffer byteBufferD = (ByteBuffer) ep9Var.get(uri);
                if (byteBufferD == null) {
                    byteBufferD = sza.d(context, uri);
                    ep9Var.put(uri, byteBufferD);
                }
                if (byteBufferD != null && f(objNewInstance, byteBufferD, rb4Var.b, rb4Var.c, rb4Var.d)) {
                }
            }
            Typeface typefaceG = g(objNewInstance);
            if (typefaceG != null) {
                return Typeface.create(typefaceG, i);
            }
        }
        return null;
    }
}
