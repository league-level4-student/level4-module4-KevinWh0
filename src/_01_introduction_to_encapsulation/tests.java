package _01_introduction_to_encapsulation;


import junit.framework.TestCase;

public class tests extends TestCase{
	EncapsulateTheData encapsulationTst = new EncapsulateTheData();
	public void testItemsReceived() {
		encapsulationTst.setItemsReceived(-1);
		assertEquals(0, encapsulationTst.getItmsRecived());
	}
	public void testDegreesTurned() {
		encapsulationTst.setDegreesTurned(706f);
		assertEquals(360f, encapsulationTst.getDegreesTurned());
	}
	public void testNomenclature() {
		encapsulationTst.setNomenclature("");
		assertEquals(" ", encapsulationTst.getNomenclature());
	}
	public void testObj() {
		encapsulationTst.setObj("Hello");
		assertEquals(new Object().getClass(), encapsulationTst.getObj().getClass());
	}
}
