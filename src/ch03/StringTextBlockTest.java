package ch03;

public class StringTextBlockTest {

	public static void main(String[] args) {
		
		String textBlock = """
				this
				is
				a
				text
				block
				""";
		
		System.out.println(textBlock);
		System.out.println(getBlockOfHtml());
	}
	
	public static String getBlockOfHtml() {
	    return """
	            <html>

	                <body>
	                    <span>example text</span>
	                </body>
	            </html>""";
	
	}

}
