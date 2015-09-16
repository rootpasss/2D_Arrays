//-------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

//-------------------------------------------------------------------------------------------------------------------------------------------------

/**
 * Engineered and developed by Jhonny Trejos Barrios.
 * Technology: Java.
 * Version: Java Development Kit 1.8.0_31, Standard Edition.
 * Development Environment: Sublime Text 3.
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * Additional Info.
 *
 * Source Code Target:
 *
 *			BIDIMENSIONAL ARRAY, UP-DOWN PATTERN BUILD.
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Pattern
{
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main( String[] args )
	{
		System.out.print( "Array size: " );

		new Pattern().printPath( new Scanner( System.in ).nextInt() );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void printPath( int size )
	{
		int[][] array = new int[ size ][ size ];
		int x = array.length, y = 0;
		boolean up = true, down = false;

		for( int k = 1; k <= size * size; k++ )
		{
			if( up )
			{
				x --;
			}
			else
			{
				x ++;
			}

			if( x == - 1 )
			{
				x ++;
				y ++;
				up = false;
				down = true;
			}

			if( x == array.length )
			{
				x --;
				y ++;
				up = true;
				down = false;
			}

			array[ x ][ y ] = k;
		}

		for( int i = 0; i < array.length; i++ )
		{
			System.out.println( "" );

			for( int j = 0; j < array.length; j++ )
			{
				System.out.print( array[ i ][ j ] + "\t" );
			}
		}
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------