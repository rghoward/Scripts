package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h19 {
    public static final List<Class<?>> a = ws0.i(Application.class, q09.class);
    public static final List<Class<?>> b = ws0.h(q09.class);

    public static final Constructor a(List list, Class cls) {
        cls.getClass();
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listE = u30.E(parameterTypes);
            if (list.equals(listE)) {
                return constructor;
            }
            if (list.size() == listE.size() && listE.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends mhb> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        cls.getClass();
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            up2.a("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            jl.a("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
