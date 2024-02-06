package chap10.ex12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyExam {

	public static void main(String[] args) throws Exception {
		// JAVA IO
		// 위치지정 + 주스트림 준비(가져올 곳, 내보낼 곳)
		
		// 보조스트림 준비

		// 읽어오기
		// 쓰기
		// 자원반납(flush, close)

		// JAVA NIO
		// 위치지정(가져올 곳, 내보낼 곳)
		Path from = Paths.get("C:/img/high.jpg");
		Path to = Paths.get("C:/img/nio/high.jpg");
		
		long start = System.currentTimeMillis();
		// 읽어오기 + 쓰기 = copy 메서드 사용
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		/* REPLACE_EXISTING : 이미 파일이 존재할 경우 덮어쓴다 (이 옵션이 없으면 파일 존재시 예외 발생)
		 * COPY_ATTRIBUTES : 파일의 속성 까지도 복사(권한, 읽기 여부 등...)
		 */
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간 : " + (end - start) + "ms");                  
		

	}

}







