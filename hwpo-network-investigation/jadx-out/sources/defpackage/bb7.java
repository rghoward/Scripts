package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bb7 implements nv9 {
    public static final bb7 b = new bb7();
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a = 0;

    public static mhb a(Class cls) throws InvocationTargetException {
        cls.getClass();
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                gh6.a(cls, "Cannot create an instance of ");
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (mhb) objNewInstance;
            } catch (IllegalAccessException e) {
                up2.a("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                up2.a("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            up2.a("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }
}
